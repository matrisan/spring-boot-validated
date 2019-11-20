package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.pojo.dto.UserConvertDTO;

/**
 * <p>
 * 创建时间为 上午10:13 2019/11/20
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IConvertGroupController {

    UserConvertDTO save(UserConvertDTO userConvertDTO);

}
