package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.pojo.dto.ValidConvertDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 石少东
 * @date 2020-11-12 20:02
 * @since 1.0
 */

@RestController
public class ValidConvertController {

    @PostMapping("/convert")
    public ValidConvertDTO valid(@Valid @RequestBody ValidConvertDTO data) {
        return data;
    }

}
