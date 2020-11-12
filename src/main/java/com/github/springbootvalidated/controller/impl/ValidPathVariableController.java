package com.github.springbootvalidated.controller.impl;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;

/**
 * @author 石少东
 * @date 2020-11-12 20:34
 * @since 1.0
 */

@Validated
@RestController
public class ValidPathVariableController {

    @GetMapping("/path/{data}")
    public String valid(@Size(min = 3, max = 6) @PathVariable String data) {
        return data;
    }

}
