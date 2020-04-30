package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.annotation.PathUser;
import com.github.springbootvalidated.pojo.doo.UserInfoDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

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

@Validated
public interface IUserInfoBodyController {

    Page<UserInfoDO> findAll(Pageable pageable);

    UserInfoDO findById(@PathUser UserInfoDO user);


}
