package com.github.springbootvalidated.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;


/**
 * <p>
 * 创建时间为 14:29 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Validated
@RestController
public class ValidMethodController {

    @GetMapping("/method/{data}")
    public String getPathVariable(@Size(min = 3, max = 6) @PathVariable String data) {
        return data;
    }

}
