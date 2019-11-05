package com.github.springbootvalidated.service.impl;

import com.github.springbootvalidated.pojo.UserInfoDO;
import com.github.springbootvalidated.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 创建时间为 下午9:43 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public List<UserInfoDO> getUsersByAge(Integer age) {
        return null;
    }

}
