package com.github.springbootvalidated.controller.impl;

import org.intellij.lang.annotations.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@AutoConfigureMockMvc
@ActiveProfiles("junit")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ValidCustomControllerImplTest extends AbstractController {

    private static final String path = "/custom";

    private static final ResultMatcher jsonPathMatcher = jsonPath("$.username").value("name1");

    @Test
    public void valid() {
        postOk(path, postNormal(), jsonPathMatcher);
        postBadRequest(path, postAbnormal());
    }

    /**
     * 数据
     *
     * @return "{\"id\": 1,\"username\": \"name1\"}";
     */
    @Language("JSON")
    private String postNormal() {
        return "{\n" +
                "  \"username\": \"name1\",\n" +
                "  \"type\": \"JAVA\"\n" +
                "}";
    }

    /**
     * 数据
     *
     * @return "{\"id\": 1,\"username\": \"name1\"}";
     */
    @Language("JSON")
    private String postAbnormal() {
        return "{\n" +
                "  \"username\": \"name1\",\n" +
                "  \"type\": \"JAVA8\"\n" +
                "}";
    }

}