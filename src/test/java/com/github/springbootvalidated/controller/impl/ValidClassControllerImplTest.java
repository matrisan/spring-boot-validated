package com.github.springbootvalidated.controller.impl;

import org.intellij.lang.annotations.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@AutoConfigureMockMvc
@ActiveProfiles("junit")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class ValidClassControllerImplTest extends AbstractController {

    private static final String PATH = "/class";

    private static final ResultMatcher jsonPathMatcher = jsonPath("$.username").value("name1");

    @Test
    public void valid() {
        postOk(PATH, buildNormal(), jsonPathMatcher);
        postBadRequest(PATH, buildAbnormal());
    }

    /**
     * 数据
     *
     * @return "{\"id\": 1,\"username\": \"name1\"}";
     */
    @Language("JSON")
    private String buildNormal() {
        return "{\n" +
                "  \"username\": \"name1\",\n" +
                "  \"pass1\": \"1234\",\n" +
                "  \"pass2\": \"1234\"\n" +
                "}";
    }

    /**
     * 数据
     *
     * @return "{\"id\": 1,\"username\": \"name1\"}";
     */
    @Language("JSON")
    private String buildAbnormal() {
        return "{\n" +
                "  \"username\": \"name1\",\n" +
                "  \"pass1\": \"1234\",\n" +
                "  \"pass2\": \"123456\"\n" +
                "}";
    }

}