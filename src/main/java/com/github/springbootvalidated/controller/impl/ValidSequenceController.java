package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.pojo.dto.ValidSequenceDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 石少东
 * @date 2020-11-12 19:50
 * @since 1.0
 */

@RestController
public class ValidSequenceController {

    @PostMapping("/sequence")
    public ValidSequenceDTO valid(@Valid @RequestBody ValidSequenceDTO data) {
        return data;
    }

}
