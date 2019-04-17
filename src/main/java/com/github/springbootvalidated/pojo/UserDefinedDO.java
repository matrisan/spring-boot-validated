package com.github.springbootvalidated.pojo;

import com.alibaba.fastjson.JSON;
import com.github.springbootvalidated.annotation.Defined;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 创建时间为 11:28 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Getter
@Setter
public class UserDefinedDO {

    @Defined(value = {"1", "2", "3"})
    private String id;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
