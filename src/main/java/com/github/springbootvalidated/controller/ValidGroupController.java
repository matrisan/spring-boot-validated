package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.annotation.group.IPostCreate;
import com.github.springbootvalidated.annotation.group.IPutUpdate;
import com.github.springbootvalidated.pojo.UserGroupDO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 创建时间为 14:47 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
public class ValidGroupController {

    @PostMapping("group")
    public UserGroupDO postUserGroupDO(@RequestBody @Validated({IPostCreate.class}) UserGroupDO userGroupDO) {
        return userGroupDO;
    }

    @PutMapping("group")
    public UserGroupDO putUserGroupDO(@RequestBody @Validated({IPutUpdate.class}) UserGroupDO userGroupDO) {
        return userGroupDO;
    }

}
