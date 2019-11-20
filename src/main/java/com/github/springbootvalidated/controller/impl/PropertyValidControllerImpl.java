package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.config.ConfigValidateProperty;
import com.github.springbootvalidated.controller.IPropertyValidController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 下午9:46 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
public class PropertyValidControllerImpl implements IPropertyValidController {

    @Resource
    private ConfigValidateProperty validate;

    @GetMapping("/property")
    @Override
    public ConfigValidateProperty getConfigValidate() {
        return validate;
    }

}
