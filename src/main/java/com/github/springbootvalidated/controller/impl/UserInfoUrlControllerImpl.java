package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.controller.IUserInfoUrlController;
import com.github.springbootvalidated.pojo.doo.UserInfoDO;
import com.github.springbootvalidated.repository.IUserInfoRepository;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 创建时间为 下午12:46 2019/11/20
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class UserInfoUrlControllerImpl implements IUserInfoUrlController {

    @Resource
    private IUserInfoRepository repository;

    @GetMapping("/user/id/{id}")
    @Override
    public UserInfoDO findById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/user/age/{age}")
    @Override
    public List<UserInfoDO> getUsersByAge(@PathVariable @Range(min = 0, max = 1000) Integer age) {
        return repository.findAllByAgeEquals(age);
    }

}
