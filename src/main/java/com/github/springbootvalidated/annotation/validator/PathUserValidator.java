package com.github.springbootvalidated.annotation.validator;

import com.github.springbootvalidated.annotation.PathUser;
import com.github.springbootvalidated.pojo.doo.UserInfoDO;
import com.github.springbootvalidated.repository.IUserInfoRepository;
import lombok.extern.slf4j.Slf4j;

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

@Slf4j
public class PathUserValidator implements ConstraintValidator<PathUser, UserInfoDO> {

    @Resource
    private IUserInfoRepository repository;

    @Override
    public boolean isValid(UserInfoDO user, ConstraintValidatorContext constraintValidatorContext) {
        log.info(user.toString());
        return true;
    }

}
