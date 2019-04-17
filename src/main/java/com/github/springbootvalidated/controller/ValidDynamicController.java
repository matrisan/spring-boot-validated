package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.pojo.UserDynamicDO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


/**
 * <p>
 * 创建时间为 14:25 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
public class ValidDynamicController {

    @PostMapping("dynamic")
    public UserDynamicDO postUserDynamicDO(@RequestBody @Valid UserDynamicDO dynamicDO) {
        return dynamicDO;
    }

}
