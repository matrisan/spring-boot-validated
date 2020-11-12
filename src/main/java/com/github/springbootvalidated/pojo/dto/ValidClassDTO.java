package com.github.springbootvalidated.pojo.dto;

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
public class ValidClassDTO implements Serializable {

    private static final long serialVersionUID = -4853422230236580485L;

    private String username;

    private String pass1;

    private String pass2;


}
