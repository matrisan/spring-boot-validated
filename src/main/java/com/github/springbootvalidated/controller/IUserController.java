package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.annotation.Cross;
import com.github.springbootvalidated.pojo.UserInfoDO;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import java.util.List;

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

public interface IUserController {

    UserInfoDO createUser(@Valid UserInfoDO userInfoDO);

    List<UserInfoDO> getUsersByAge(@Range(min = 0, max = 1000) Integer age);

    /**
     * 交叉校验,逻辑可以自定义,也可以用在普通的方法上,不仅仅是 Controller 上
     *
     * @param pass1 pass1
     * @param pass2 pass2
     * @return String
     */
    @Cross
    String passCheck(String pass1, String pass2);

}
