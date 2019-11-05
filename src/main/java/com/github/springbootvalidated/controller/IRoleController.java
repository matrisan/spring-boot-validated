package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.annotation.group.IPostCreate;
import com.github.springbootvalidated.annotation.group.IPutUpdate;
import com.github.springbootvalidated.pojo.RoleInfoDO;
import org.springframework.validation.annotation.Validated;

/**
 * <p>
 * 创建时间为 下午6:35 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IRoleController {

    RoleInfoDO createRole(@Validated({IPostCreate.class}) RoleInfoDO roleInfoDO);

    RoleInfoDO updateRole(@Validated({IPutUpdate.class}) RoleInfoDO roleInfoDO);

}
