package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.controller.IWebXssProtectController;
import com.github.springbootvalidated.pojo.dto.WebXssProtectDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 创建时间为 下午4:13 2019/11/25
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class WebXssProtectControllerImpl implements IWebXssProtectController {

    @PostMapping("/body/check")
    @Override
    public WebXssProtectDTO check(@Valid @RequestBody WebXssProtectDTO webXssProtectDTO) {
        return webXssProtectDTO;
    }
}
