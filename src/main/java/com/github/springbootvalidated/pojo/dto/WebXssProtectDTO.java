package com.github.springbootvalidated.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.ScriptAssert;

/**
 * <p>
 * 创建时间为 下午4:12 2019/11/25
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebXssProtectDTO {

    @SafeHtml(whitelistType = SafeHtml.WhiteListType.NONE)
    private String content;

//    @ScriptAssert
    private String script;

}
