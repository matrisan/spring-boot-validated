package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.pojo.dto.WebXssProtectDTO;

/**
 * <p>
 * 创建时间为 下午4:12 2019/11/25
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IWebXssProtectController {

    /**
     * 检查
     *
     * @param webXssProtectDTO WebXssProtectDTO
     * @return WebXssProtectDTO
     */
    WebXssProtectDTO check(WebXssProtectDTO webXssProtectDTO);


}
