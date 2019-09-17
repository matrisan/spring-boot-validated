package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.config.ConfigValidateProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 上午10:09 2019/9/17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
public class ValidPropertyController {

    @Resource
    private ConfigValidateProperty validate;

    @GetMapping("property")
    public ConfigValidateProperty getConfigValidate() {
        return validate;
    }


}
