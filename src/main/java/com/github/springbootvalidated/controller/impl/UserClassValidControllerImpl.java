package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.controller.IUserClassValidController;
import com.github.springbootvalidated.pojo.dto.UserClassDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 创建时间为 上午10:40 2019/11/20
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class UserClassValidControllerImpl implements IUserClassValidController {

    @PostMapping("/class")
    @Override
    public UserClassDTO save(@RequestBody @Valid UserClassDTO userClassDTO) {
        return userClassDTO;
    }

}
