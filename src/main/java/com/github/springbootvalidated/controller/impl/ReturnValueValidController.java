package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.pojo.doo.UserDO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 创建时间为 下午4:59 2019/12/9
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Validated
@RestController
public class ReturnValueValidController {

    @GetMapping("/path/{age}")
    public @NotNull UserDO getUser(@PathVariable Integer age) {
        if (age > 100) {
            return null;
        }
        return new UserDO();
    }


}
