package com.github.springbootvalidated.annotation.group;

import javax.validation.GroupSequence;

/**
 * <p>
 * 创建时间为 14:21 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
@GroupSequence({IPostCreate.class, IPutUpdate.class})
public interface IGroupSequence {
}
