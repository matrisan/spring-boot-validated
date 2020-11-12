package com.github.springbootvalidated.controller.impl;

import org.intellij.lang.annotations.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@AutoConfigureMockMvc
@ActiveProfiles("junit")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ValidDynamicControllerImplTest extends AbstractController {

    private static final String path = "/dynamic";

    @Test
    public void valid1() {
        postOk(path, buildNormal(), jsonPath("$.username").value("name1"));
    }

    @Test
    public void valid2() {
        postBadRequest(path, buildAbnormal());
    }

    /**
     * 数据
     *
     * @return "{\"id\": 1,\"username\": \"name1\"}";
     */
    @Language("JSON")
    private String buildNormal() {
        return "{\"id\": 1,\"username\": \"name1\"}";
    }

    /**
     * 数据
     *
     * @return "{\"id\": 1,\"username\": \"name1\"}";
     */
    @Language("JSON")
    private String buildAbnormal() {
        return "{\"id\": 11,\"username\": \"name1\"}";
    }

}