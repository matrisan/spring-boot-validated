package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.pojo.UserCommonDO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 创建时间为 10:28 2019-04-16
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
public class ValidCommonController {

    /**
     * 使用 JSR303 自带的校验注解进行校验
     *
     * @param userCommonDO UserCommonDO
     * @return UserCommonDO
     */
    @PostMapping("common")
    public UserCommonDO postUserCommonDO(@RequestBody @Valid UserCommonDO userCommonDO) {
        return userCommonDO;
    }

}
