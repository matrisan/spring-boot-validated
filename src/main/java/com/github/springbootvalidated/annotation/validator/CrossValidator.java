package com.github.springbootvalidated.annotation.validator;

import com.github.springbootvalidated.annotation.constraint.Cross;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;

/**
 * <p>
 * 创建时间为 13:14 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@SupportedValidationTarget(ValidationTarget.PARAMETERS)
public class CrossValidator implements ConstraintValidator<Cross, Object[]> {

    @Override
    public boolean isValid(Object[] values, ConstraintValidatorContext context) {
        return StringUtils.equalsIgnoreCase((String) values[0], (String) values[1]);
    }

}
