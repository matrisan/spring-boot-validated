package com.github.springbootvalidated.pojo;

import com.alibaba.fastjson.JSON;
import com.github.springbootvalidated.annotation.Dynamic;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * <p>
 * 创建时间为 12:45 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
public class UserDynamicDO {

    @NotBlank
    private String name;

    @NotNull
    @Dynamic
    private Set<String> books;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
