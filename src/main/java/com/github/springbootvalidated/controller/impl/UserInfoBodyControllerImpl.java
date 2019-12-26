package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.controller.IUserInfoBodyController;
import com.github.springbootvalidated.pojo.dto.UserInfoDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 对单个参数校验时需要在类上面使用@Validated
 *
 * <p>
 * 创建时间为 下午6:11 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */


@Validated
@RestController
public class UserInfoBodyControllerImpl implements IUserInfoBodyController {

    @PostMapping("/user")
    @Override
    public UserInfoDTO createUser(@RequestBody @Valid UserInfoDTO userInfoDTO) {
        return userInfoDTO;
    }

}
