package com.github.springbootvalidated.pojo.dto;

import com.github.springbootvalidated.annotation.constraint.Type;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
public class ValidCustomDTO implements Serializable {


    private static final long serialVersionUID = 4494140703178391031L;
    private String username;

    @Type(value = {"JAVA", "PYTHON", "C", "LUA"})
    private String type;

}
