package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.controller.IValidController;
import com.github.springbootvalidated.pojo.dto.ValidClassDTO;
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
public class ValidClassControllerImpl implements IValidController<ValidClassDTO> {

    @PostMapping("class")
    @Override
    public ValidClassDTO valid(@Valid @RequestBody ValidClassDTO data) {
        return data;
    }
}
