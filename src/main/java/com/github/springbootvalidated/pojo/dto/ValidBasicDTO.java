package com.github.springbootvalidated.pojo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 石少东
 * @date 2020-11-12 10:47
 * @since 1.0
 */

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class ValidBasicDTO implements Serializable {

    private static final long serialVersionUID = -7844375903495119052L;

    @Length(min = 3, max = 5, message = "username 长度不为3")
    private String username;

    @Range(min = 5, max = 10, message = "range 不在范围内")
    private Integer range;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Past
    private Date birthday;
}
