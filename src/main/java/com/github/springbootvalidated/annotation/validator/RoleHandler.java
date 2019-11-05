package com.github.springbootvalidated.annotation.validator;

import com.github.springbootvalidated.annotation.Role;
import com.github.springbootvalidated.service.IRoleService;

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

public class RoleHandler implements ConstraintValidator<Role, String> {

    @Resource
    private IRoleService service;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return service.existByRoleId(value);
    }

}
