package com.github.springbootvalidated.controller;

import com.github.springbootvalidated.pojo.UserParentDO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * <p>
 * 创建时间为 15:12 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class ValidManualController {

    /**
     * 某些特殊情况下需要手动去校验对象
     *
     * @param userParentDO UserParentDO
     * @return UserParentDO
     */
    @PostMapping("manual")
    public UserParentDO postUserParentDO(@RequestBody UserParentDO userParentDO) {
        return validManual(userParentDO);
    }


    private UserParentDO validManual(UserParentDO userParentDO) {
        // 这两行可以提取为公共对象
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();
        Set<ConstraintViolation<UserParentDO>> set = validator.validate(userParentDO);
        for (ConstraintViolation<UserParentDO> constraintViolation : set) {
            System.out.println(constraintViolation.getMessage());
        }
        return userParentDO;
    }

}
