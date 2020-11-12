package com.github.springbootvalidated.annotation.validator;

import com.github.springbootvalidated.annotation.constraint.UserId;
import com.github.springbootvalidated.repository.UserInfoRepository;

import javax.annotation.Resource;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

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

public class UserIdValidator implements ConstraintValidator<UserId, Long> {

    @Resource
    private UserInfoRepository repository;

    @Override
    public boolean isValid(Long aLong, ConstraintValidatorContext constraintValidatorContext) {
        return repository.existsById(aLong);
    }

}
