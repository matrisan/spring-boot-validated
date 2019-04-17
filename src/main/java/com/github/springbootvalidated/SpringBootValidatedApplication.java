package com.github.springbootvalidated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author shao
 */
@EnableScheduling
@SpringBootApplication
public class SpringBootValidatedApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootValidatedApplication.class, args);
    }

}
