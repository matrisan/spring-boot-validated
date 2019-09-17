package com.github.springbootvalidated.config;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 创建时间为 上午10:05 2019/9/17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Getter
@Setter
@Validated
@Component
@ConfigurationProperties(prefix = "spring.validate")
public class ConfigValidateProperty {

    @NotBlank
    private String name;

    @NotBlank
    private String pass;

    @Range(min = 11, max = 18)
    private Integer age;

}
