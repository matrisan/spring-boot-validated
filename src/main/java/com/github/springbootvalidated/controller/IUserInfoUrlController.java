package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.pojo.UserInfoDO;
import org.hibernate.validator.constraints.Range;

import java.util.List;

/**
 * <p>
 * 创建时间为 下午12:46 2019/11/20
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IUserInfoUrlController {

    UserInfoDO findById(Long id);


    List<UserInfoDO> getUsersByAge(@Range(min = 0, max = 1000) Integer age);


}
