package com.github.springbootvalidated.service.impl;

import com.github.springbootvalidated.service.IRoleService;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 创建时间为 下午6:23 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Service
public class RoleServiceImpl implements IRoleService {

    private List<String> list = Lists.newArrayList("AA", "BB", "CC");

    @Override
    public boolean existByRoleId(String id) {
        return list.contains(id);
    }

}
