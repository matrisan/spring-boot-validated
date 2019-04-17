package com.github.springbootvalidated.annotation.validator;

import com.github.springbootvalidated.annotation.Dynamic;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * <p>
 * 创建时间为 12:47 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */


public class DynamicValidator implements ConstraintValidator<Dynamic, String> {

    /**
     * 得用线程安全的容器,当对容器中元素进行遍历同时增加数据时会抛出 fail-fast 错误
     */
    private volatile static CopyOnWriteArraySet<String> dynamicSet;

    @Override
    public boolean isValid(String set, ConstraintValidatorContext constraintValidatorContext) {
        return dynamicSet.contains(set);
    }

    public static void setSet(CopyOnWriteArraySet<String> set) {
        DynamicValidator.dynamicSet = set;
    }
}
