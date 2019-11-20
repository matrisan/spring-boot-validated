package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.config.ConfigValidateProperty;

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

public interface IPropertyController {

    /**
     * 查询从配置文件(application.properties)读取到的配置信息
     *
     * @return ConfigValidateProperty
     */
    ConfigValidateProperty getConfigValidate();
}
