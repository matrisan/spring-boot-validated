package com.github.springbootvalidated.service;

import com.github.springbootvalidated.pojo.UserInfoDO;

import java.util.List;

/**
 * <p>
 * 创建时间为 下午9:43 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IUserService {


    List<UserInfoDO> getUsersByAge(Integer age);
}
