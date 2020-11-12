package com.github.springbootvalidated.config;

import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author 石少东
 * @date 2020-11-12 19:40
 * @since 1.0
 */

//@Configuration
public class HibernateFailFastConfig {

    @Resource
    private LocalValidatorFactoryBean validator;

    @PostConstruct
    public void init() {
        validator.getValidationPropertyMap().put("hibernate.validator.fail_fast", "true");
    }

}
