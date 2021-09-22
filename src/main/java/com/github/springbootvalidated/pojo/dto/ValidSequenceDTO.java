package com.github.springbootvalidated.pojo.dto;

import com.github.springbootvalidated.annotation.sequence.First;
import com.github.springbootvalidated.annotation.sequence.Second;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.GroupSequence;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.groups.Default;

/**
 * 有点类似快速失败得意思，
 * 最后一位必须是校验的实体类本身
 *
 * @author 石少东
 * @date 2020-11-12 19:51
 * @since 1.0
 */

@Getter
@Setter
@Builder
@ToString
@GroupSequence({Default.class, First.class, Second.class, ValidSequenceDTO.class})
public class ValidSequenceDTO {

    @NotBlank(groups = {First.class})
    private String username;

    @NotBlank(groups = {Second.class})
    private String password;

    @Min(0)
    @Max(100)
    private Integer age;

}
