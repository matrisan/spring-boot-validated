package com.github.springbootvalidated.service;

import com.github.springbootvalidated.pojo.doo.UserParentDO;

import javax.validation.Valid;

/**
 * <p>
 * 创建时间为 14:30 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IValidMethodService {

    <T> T getResult(@Valid T t);

    <T extends UserParentDO> T getParent(@Valid T t);

}
