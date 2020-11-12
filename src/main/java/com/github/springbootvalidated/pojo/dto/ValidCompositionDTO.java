package com.github.springbootvalidated.pojo.dto;

import com.github.springbootvalidated.annotation.constraint.Composition;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 石少东
 * @date 2020-11-12 23:54
 * @since 1.0
 */


@Getter
@Setter
@Builder
@ToString
public class ValidCompositionDTO {

    private String username;

    @Composition
    private String number;

    private String pass1;

}
