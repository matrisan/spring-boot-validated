package com.github.springbootvalidated.schedule;

import com.github.springbootvalidated.annotation.validator.DynamicValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * <p>
 * 创建时间为 14:22 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Slf4j
@Component
public class DynamicSchedule {

    @Scheduled(fixedDelay = 10000)
    public void autoSync() {
        CopyOnWriteArraySet<String> dynamicSet = new CopyOnWriteArraySet<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            dynamicSet.add(random.nextInt(10) + "");
        }
        DynamicValidator.setSet(dynamicSet);
        log.info(dynamicSet.toString());
    }

}
