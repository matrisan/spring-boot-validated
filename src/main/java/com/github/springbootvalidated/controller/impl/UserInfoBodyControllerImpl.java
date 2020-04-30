package com.github.springbootvalidated.controller.impl;

import com.github.springbootvalidated.annotation.PathUser;
import com.github.springbootvalidated.annotation.group.IPostCreate;
import com.github.springbootvalidated.annotation.group.IPutUpdate;
import com.github.springbootvalidated.controller.IUserInfoBodyController;
import com.github.springbootvalidated.pojo.doo.UserInfoDO;
import com.github.springbootvalidated.repository.IUserInfoRepository;
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
public class UserInfoBodyControllerImpl implements IUserInfoBodyController {

    @Resource
    private IUserInfoRepository repository;

    @GetMapping("/users")
    @Override
    public Page<UserInfoDO> findAll(@PageableDefault(size = 4, page = 1, sort = "id", direction = Sort.Direction.ASC)
                                            Pageable pageable) {
        return repository.findAll(pageable);
    }

    @GetMapping("/user/{id}")
    @Override
    public UserInfoDO findById(@PathVariable("id") @PathUser UserInfoDO user) {
        return user;
    }



}
