package com.github.springbootvalidated.pojo;

import com.github.springbootvalidated.annotation.Gender;
import com.github.springbootvalidated.annotation.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 创建时间为 下午6:12 2019/9/27
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
public class UserInfoDO {

    @NotBlank
    private String id;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @Range(min = 0, max = 1000)
    private Integer age;

    @NotBlank
    @Gender(value = {"male", "female", "unknown"})
    private String gender;

    @Role
    @NotBlank
    private String role;

}
