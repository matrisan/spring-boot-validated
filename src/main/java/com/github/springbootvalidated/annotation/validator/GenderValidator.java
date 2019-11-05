package com.github.springbootvalidated.annotation.validator;

import com.github.springbootvalidated.annotation.Gender;
import com.github.springbootvalidated.annotation.StringRange;
import com.google.common.collect.Sets;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Set;

/**
 * <p>
 * 创建时间为 14:53 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */


public class GenderValidator implements ConstraintValidator<Gender, String> {

    private Set<String> values;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return values.contains(value);
    }

    @Override
    public void initialize(Gender built) {
        this.values = Sets.newHashSet(built.value());
    }

}

