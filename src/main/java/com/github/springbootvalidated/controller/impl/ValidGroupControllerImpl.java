package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.annotation.group.IPostCreate;
import com.github.springbootvalidated.annotation.group.IPutUpdate;
import com.github.springbootvalidated.controller.IValidController;
import com.github.springbootvalidated.pojo.dto.ValidGroupDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 石少东
 * @date 2020-11-12 10:51
 * @since 1.0
 */

@RestController
public class ValidGroupControllerImpl implements IValidController<ValidGroupDTO> {

    @PostMapping("group")
    @Override
    public ValidGroupDTO valid(@Validated(IPostCreate.class) @RequestBody ValidGroupDTO data) {
        return data;
    }

    @PutMapping("group")
    public ValidGroupDTO put(@Validated(IPutUpdate.class) @RequestBody ValidGroupDTO data) {
        return data;
    }

}
