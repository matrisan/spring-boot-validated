package com.github.springbootvalidated.annotation.validator;

import com.github.springbootvalidated.annotation.UserId;
import com.github.springbootvalidated.service.impl.UserIDServiceImpl;

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


public class UserIdValidator implements ConstraintValidator<UserId, String> {

    @Override
    public boolean isValid(String userId, ConstraintValidatorContext constraintValidatorContext) {
        return UserIDServiceImpl.SERVICE.existByUserId(userId);
    }

}
