package com.github.springbootvalidated.service;

/**
 * <p>
 * 创建时间为 下午2:09 2019/9/4
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IUserIDService {

    boolean existByUserId(String userId);

}
