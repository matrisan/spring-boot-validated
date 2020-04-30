package com.github.springbootvalidated.pojo.doo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * DefaultGroupSequenceProvider
 *
 * <p>
 * 创建时间为 下午5:36 2019/12/9
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
public class UserMessageDO {

    @Length(min = 2, max = 5, message = "用户名长度必须在{min}和{max}之间")
    private String username;

    private String password;

    @Min(value = 0, message = "age的值:[${validatedValue}]过小")
    @Max(value = 100, message = "age的值:[${validatedValue}]过大")
    private Integer age;

}
