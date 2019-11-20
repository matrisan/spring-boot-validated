package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.pojo.dto.UserClassDTO;

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

public interface IUserClassValidController {

    /**
     * 使用类校验器对 UserClassDTO 进行校验
     *
     * @param userClassDTO UserClassDTO
     * @return UserClassDTO
     */
    UserClassDTO save(@Valid UserClassDTO userClassDTO);

}
