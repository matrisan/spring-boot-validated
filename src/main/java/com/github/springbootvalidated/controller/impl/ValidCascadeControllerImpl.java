package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.controller.IValidController;
import com.github.springbootvalidated.pojo.dto.ValidCascadeDTO;
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
public class ValidCascadeControllerImpl implements IValidController<ValidCascadeDTO> {

    @PostMapping("cascade")
    @Override
    public ValidCascadeDTO valid(@Valid @RequestBody ValidCascadeDTO data) {
        return data;
    }
}
