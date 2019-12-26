package com.github.springbootvalidated.pojo.doo;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Set;

/**
 * <p>
 * 创建时间为 14:35 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
public class UserChildDO extends UserParentDO implements Serializable {

    @NotBlank
    private String pass;

    private Set<String> books;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
