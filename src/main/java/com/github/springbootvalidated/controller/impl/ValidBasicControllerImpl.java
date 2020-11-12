package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.controller.IValidController;
import com.github.springbootvalidated.pojo.dto.ValidBasicDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 石少东
 * @date 2020-11-12 10:51
 * @since 1.0
 */

@RestController
public class ValidBasicControllerImpl implements IValidController<ValidBasicDTO> {

    @PostMapping("basic")
    @Override
    public ValidBasicDTO valid(@Valid @RequestBody ValidBasicDTO data) {
        return data;
    }




}
