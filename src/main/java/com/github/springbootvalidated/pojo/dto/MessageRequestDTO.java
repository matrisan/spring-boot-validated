package com.github.springbootvalidated.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author 石少东
 * @date 2020-11-12 18:13
 * @since 1.0
 */

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MessageRequestDTO {

    @Length(min = 2, max = 5, message = "用户名长度必须在{min}和{max}之间")
    private String username;

    private String password;

    @Min(value = 0, message = "age的值:[${validatedValue}]过小")
    @Max(value = 100, message = "age的值:[${validatedValue}]过大")
    private Integer age;


}
