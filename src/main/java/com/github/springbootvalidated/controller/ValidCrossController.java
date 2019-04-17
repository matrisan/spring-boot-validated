package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.annotation.Cross;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 创建时间为 14:41 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Validated
@RestController
public class ValidCrossController {

    @Cross
    @GetMapping("cross/{pass1}/{pass2}")
    public String getCrossParameter(@NotBlank @PathVariable String pass1, @NotBlank @PathVariable String pass2) {
        return pass1 + ":" + pass2;
    }

}
