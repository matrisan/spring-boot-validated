package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.pojo.dto.MessageI18nDTO;
import com.github.springbootvalidated.pojo.dto.MessageRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author 石少东
 * @date 2020-11-12 15:47
 * @since 1.0
 */

@RestController
public class ValidMessageControllerImpl {


    @PostMapping(value = "/message/language")
    public MessageI18nDTO valid1(@Valid @RequestBody MessageI18nDTO data) {
        return data;
    }

    @PostMapping(value = "/message/request")
    public MessageRequestDTO valid2(@Valid @RequestBody MessageRequestDTO data) {
        return data;
    }


}
