package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.pojo.doo.UserCommonDO;

import javax.validation.Valid;

/**
 * <p>
 * 创建时间为 上午10:14 2019/11/20
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IUserCommonController {

    /**
     * 使用 JSR303 自带的校验注解进行校验
     *
     * @param userCommonDO UserCommonDO
     * @return UserCommonDO
     */
    UserCommonDO postUserCommon(@Valid UserCommonDO userCommonDO);
}
