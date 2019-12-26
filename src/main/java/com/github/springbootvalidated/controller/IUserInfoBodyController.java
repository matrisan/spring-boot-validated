package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.pojo.dto.UserInfoDTO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * <p>
 * 创建时间为 下午6:10 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IUserInfoBodyController {


    UserInfoDTO createUser(@Valid UserInfoDTO userInfoDTO);

}
