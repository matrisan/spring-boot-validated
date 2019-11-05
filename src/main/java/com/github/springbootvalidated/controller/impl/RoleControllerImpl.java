package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.annotation.group.IPostCreate;
import com.github.springbootvalidated.annotation.group.IPutUpdate;
import com.github.springbootvalidated.controller.IRoleController;
import com.github.springbootvalidated.pojo.RoleInfoDO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 创建时间为 下午6:37 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class RoleControllerImpl implements IRoleController {

    @PostMapping("/role")
    @Override
    public RoleInfoDO createRole(@Validated({IPostCreate.class}) RoleInfoDO roleInfoDO) {
        return roleInfoDO;
    }

    @PutMapping("/role")
    @Override
    public RoleInfoDO updateRole(@Validated({IPutUpdate.class}) RoleInfoDO roleInfoDO) {
        return roleInfoDO;
    }
}
