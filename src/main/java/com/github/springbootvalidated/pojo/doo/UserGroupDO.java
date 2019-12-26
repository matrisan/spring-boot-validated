package com.github.springbootvalidated.pojo.doo;

import com.alibaba.fastjson.JSON;
import com.github.springbootvalidated.annotation.group.IPostCreate;
import com.github.springbootvalidated.annotation.group.IPutUpdate;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * <p>
 * 创建时间为 14:43 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
public class UserGroupDO implements Serializable {

    @NotBlank(groups = {IPutUpdate.class})
    private String id;

    @NotBlank(groups = {IPostCreate.class, IPutUpdate.class})
    private String name;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
