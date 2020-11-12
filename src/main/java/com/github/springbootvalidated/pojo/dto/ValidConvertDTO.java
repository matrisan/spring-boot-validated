package com.github.springbootvalidated.pojo.dto;


import com.github.springbootvalidated.annotation.sequence.First;
import com.github.springbootvalidated.annotation.sequence.Second;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.groups.ConvertGroup;

/**
 * <p>
 * 创建时间为 下午12:14 2019/11/20
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ValidConvertDTO {

    @Valid
    @ConvertGroup(from= First.class, to= Second.class)
    private String username;

    private String password;


}
