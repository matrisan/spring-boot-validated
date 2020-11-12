package com.github.springbootvalidated.pojo.dto;

import com.github.springbootvalidated.annotation.group.IPostCreate;
import com.github.springbootvalidated.annotation.group.IPutUpdate;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;

/**
 * @author 石少东
 * @date 2020-11-12 10:48
 * @since 1.0
 */

@Getter
@Setter
@Builder
@ToString
public class ValidGroupDTO implements Serializable {

    private static final long serialVersionUID = -6743745459924434998L;

    @Null(groups = IPutUpdate.class)
    private Long id;

    @NotBlank(groups = {IPostCreate.class, IPutUpdate.class})
    private String username;

    @NotBlank(groups = {IPostCreate.class, IPutUpdate.class})
    private String age;

}
