package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.pojo.dto.ValidCompositionDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 石少东
 * @date 2020-11-12 22:52
 * @since 1.0
 */

@RestController
public class ValidCompositionController {


    @PostMapping("composition")
    public ValidCompositionDTO valid(@Valid @RequestBody ValidCompositionDTO data) {
        return data;
    }

}
