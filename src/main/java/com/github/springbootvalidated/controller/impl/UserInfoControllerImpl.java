package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.annotation.Cross;
import com.github.springbootvalidated.annotation.group.IPostCreate;
import com.github.springbootvalidated.annotation.group.IPutUpdate;
import com.github.springbootvalidated.controller.IUserInfoController;
import com.github.springbootvalidated.pojo.UserInfoDO;
import com.github.springbootvalidated.repository.IUserInfoRepository;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 对单个参数校验时需要在类上面使用@Validated
 *
 * <p>
 * 创建时间为 下午6:11 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */


@Validated
@RestController
public class UserInfoControllerImpl implements IUserInfoController {

    @Resource
    private IUserInfoRepository repository;

    @GetMapping("/users")
    @Override
    public Page<UserInfoDO> findAll(@PageableDefault(size = 4, page = 1, sort = "id", direction = Sort.Direction.ASC)
                                            Pageable pageable) {
        return repository.findAll(pageable);
    }

    @GetMapping("/user/age/{age}")
    @Override
    public List<UserInfoDO> getUsersByAge(@PathVariable @Range(min = 0, max = 1000) Integer age) {
        return repository.findAllByAgeEquals(age);
    }

    @Cross
    @GetMapping("/user/{pass1}/{pass2}")
    @Override
    public String passCheck(@PathVariable String pass1, @PathVariable String pass2) {
        return pass1 + ":" + pass2;
    }

    @PostMapping("/user")
    @Override
    public UserInfoDO createUser(@RequestBody @Validated({IPostCreate.class}) UserInfoDO userInfoDO) {
        return userInfoDO;
    }

    @PutMapping("/user")
    @Override
    public UserInfoDO updateUser(@RequestBody @Validated({IPutUpdate.class}) UserInfoDO userInfoDO) {
        return repository.save(userInfoDO);
    }

}
