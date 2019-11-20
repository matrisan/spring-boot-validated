package com.github.springbootvalidated.pojo;

import com.github.springbootvalidated.annotation.Gender;
import com.github.springbootvalidated.annotation.UserId;
import com.github.springbootvalidated.annotation.group.IPostCreate;
import com.github.springbootvalidated.annotation.group.IPutUpdate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

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
@Entity
@Table(name = "user_info")
public class UserInfoDO  implements Serializable {

    @UserId(groups = {IPutUpdate.class})
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(groups = {IPostCreate.class, IPutUpdate.class})
    private String username;

    @NotBlank(groups = {IPostCreate.class, IPutUpdate.class})
    private String password;

    @Range(min = 0, max = 1000, groups = {IPostCreate.class, IPutUpdate.class})
    private Integer age;

    @NotBlank
    @Gender(value = {"male", "female", "unknown"})
    private String gender;

}
