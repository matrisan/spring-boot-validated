package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.annotation.constraint.Cross;
import com.github.springbootvalidated.controller.IValidController;
import com.github.springbootvalidated.pojo.dto.ValidCrossDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 石少东
 * @date 2020-11-12 10:51
 * @since 1.0
 */

@Validated
@RestController
public class ValidCrossControllerImpl implements IValidController<ValidCrossDTO> {

    @PostMapping("cross")
    @Override
    public ValidCrossDTO valid(@Valid @RequestBody ValidCrossDTO data) {
        return data;
    }

    /**
     * TODO
     * 这个地方是有点问题的，得修改一下
     *
     * @param pass1
     * @param pass2
     * @return
     */
    @GetMapping("cross/{pass1}/{pass2}")
    @Cross
    public String validCross(@PathVariable String pass1, @PathVariable String pass2) {
        return pass1 + "-" + pass2;
    }


}
