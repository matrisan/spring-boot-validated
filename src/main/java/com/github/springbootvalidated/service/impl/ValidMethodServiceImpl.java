package com.github.springbootvalidated.service.impl;

import com.github.springbootvalidated.pojo.UserParentDO;
import com.github.springbootvalidated.service.IValidMethodService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;


/**
 * <p>
 * 创建时间为 14:31 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Service
@Validated
public class ValidMethodServiceImpl implements IValidMethodService {

    @Override
    public <T> T getResult(@Valid T t) {
        return null;
    }

    @Override
    public <T extends UserParentDO> T getParent(@Valid T t) {
        return null;
    }

}
