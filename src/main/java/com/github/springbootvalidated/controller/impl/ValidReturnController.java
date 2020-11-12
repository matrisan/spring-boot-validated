package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.pojo.dto.ValidBasicDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @author 石少东
 * @date 2020-11-12 21:03
 * @since 1.0
 */

@Validated
@RestController
public class ValidReturnController {

    @PostMapping("return")
    public @NotNull ValidBasicDTO valid(@RequestBody ValidBasicDTO data) {
        return data;
    }


}
