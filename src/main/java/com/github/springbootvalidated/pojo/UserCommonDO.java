package com.github.springbootvalidated.pojo;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 创建时间为 13:43 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@Getter
@Setter
public class UserCommonDO implements Serializable {

    /**
     * 字符串，集合，map限制大小
     */
    @NotEmpty(message = "名字不能为空")
    @Size(min = 2, max = 6, message = "名字长度在2-6位")
    @Length(min = 2, max = 6, message = "名字长度在2-6位")
    private String name;

    @Length(min = 3, max = 3, message = "pass 长度不为3")
    private String pass;

    /**
     * 被注释的元素必须是一个数字，其值必须大于等于指定的最小值
     */
    @DecimalMin(value = "10", inclusive = true, message = "salary 低于10")
    private Integer salary;

    @Range(min = 5, max = 10, message = "range 不在范围内")
    private Integer range;

    @NotNull(message = "年龄不能为空")
    @Min(value = 18, message = "年龄不能小于18")
    @Max(value = 70, message = "年龄不能大于70")
    private Integer age;

    @Email
    private String email;

    @AssertTrue
    private Boolean flag;

    @Past
    private Date birthday;

    @Future
    private Date expire;

    @URL(message = "url 格式不对")
    private String url;

    //@Pattern(regex=,flag=)  被注释的元素必须符合指定的正则表达式

    /**
     * 字符串，集合，map限制大小
     */
    @Size(min = 2, max = 6, message = "长度在2-6位")
    private List<Integer> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
