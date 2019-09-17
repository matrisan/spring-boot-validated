package com.github.springbootvalidated.service.impl;

import com.github.springbootvalidated.service.IUserIDService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 创建时间为 下午2:10 2019/9/4
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Service
public class UserIDServiceImpl implements IUserIDService {

    public static UserIDServiceImpl SERVICE;

    @PostConstruct
    public void init() {
        SERVICE = this;
    }

    /**
     * 模拟访问数据库
     */
    private List<String> userIdList = Arrays.asList("11", "22", "33");

    @Override
    public boolean existByUserId(String userId) {
        return userIdList.contains(userId);
    }
}
