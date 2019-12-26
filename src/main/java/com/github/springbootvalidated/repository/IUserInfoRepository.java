package com.github.springbootvalidated.repository;

import com.github.springbootvalidated.pojo.doo.UserInfoDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <p>
 * 创建时间为 下午6:02 2019/11/19
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IUserInfoRepository extends JpaRepository<UserInfoDO, Long> {

    List<UserInfoDO> findAllByAgeEquals(int age);

}
