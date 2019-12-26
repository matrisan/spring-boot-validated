package com.github.springbootvalidated.init;

import com.github.springbootvalidated.pojo.doo.UserInfoDO;
import com.github.springbootvalidated.repository.IUserInfoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 下午11:18 2019/11/19
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Component
public class InitUserInfo implements CommandLineRunner {

    @Resource
    private IUserInfoRepository repository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 8; i++) {
            UserInfoDO userInfo = UserInfoDO.builder().username("name:" + i).password("pass:" + i)
                    .age(i).gender("male").build();
            repository.save(userInfo);
        }
    }

}
