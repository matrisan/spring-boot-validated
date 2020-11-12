package com.github.springbootvalidated.pojo.dto;

import com.github.springbootvalidated.annotation.constraint.UserId;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author 石少东
 * @date 2020-11-12 10:47
 * @since 1.0
 */

@Getter
@Setter
@Builder
@ToString
public class ValidDynamicDTO implements Serializable {

    private static final long serialVersionUID = 8332071558964864509L;
    @UserId
    private Long id;

    @NotBlank
    private String username;

}
