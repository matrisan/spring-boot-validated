package com.github.springbootvalidated.repository;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Repository;

import java.util.Set;

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

@Repository
public class UserInfoRepository {

    private final Set<Long> set = Sets.newHashSet(1L, 2L, 3L, 4L);

    public boolean existsById(long id) {
        return set.contains(id);
    }

}
