package com.github.springbootvalidated.annotation.validator;

import com.github.springbootvalidated.annotation.Dynamic;
import com.github.springbootvalidated.service.IUserIDService;

import javax.annotation.Resource;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

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

    @Resource
    private IUserIDService service;

    @Override
    public boolean isValid(String set, ConstraintValidatorContext constraintValidatorContext) {
        return service.existByUserId(set);
    }

}
