package com.github.springbootvalidated.annotation.validator;

import com.github.springbootvalidated.annotation.constraint.Type;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

/**
 * <p>
 * 创建时间为 下午6:20 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public class TypeValidator implements ConstraintValidator<Type, String> {

    private Type types;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return Arrays.stream(types.value()).anyMatch(one -> StringUtils.equals(one, value));
    }

    @Override
    public void initialize(Type constraintAnnotation) {
        this.types = constraintAnnotation;
    }
}
