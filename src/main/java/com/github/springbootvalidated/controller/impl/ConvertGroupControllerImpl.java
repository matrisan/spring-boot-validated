package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.controller.IConvertGroupController;
import com.github.springbootvalidated.pojo.dto.UserConvertDTO;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 创建时间为 上午10:15 2019/11/20
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class ConvertGroupControllerImpl implements IConvertGroupController {

    @Override
    public UserConvertDTO save(UserConvertDTO userConvertDTO) {
        return null;
    }
}
