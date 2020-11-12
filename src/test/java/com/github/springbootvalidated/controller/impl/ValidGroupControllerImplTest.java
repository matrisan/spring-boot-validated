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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
@ActiveProfiles("junit")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ValidGroupControllerImplTest extends AbstractController {

    private static final String PATH = "/group";

    private static final ResultMatcher jsonPathMatcher = jsonPath("$.username").value("name1");

    @Test
    public void valid() {
        postOk(PATH, postNormal(), jsonPathMatcher);
        postBadRequest(PATH, postAbnormal());
    }

    @Test
    public void put() {
        putOk(PATH, putNormal(), jsonPathMatcher);
        putBadRequest(PATH, putAbnormal());
    }

    @Language("JSON")
    private String postNormal() {
        return "{\n" +
                "  \"id\": 12,\n" +
                "  \"username\": \"name1\",\n" +
                "  \"age\": 22\n" +
                "}";
    }

    @Language("JSON")
    private String postAbnormal() {
        return "{\n" +
                "  \"id\": 12,\n" +
                "  \"username\": \"name1\"\n" +
                "}";
    }

    @Language("JSON")
    private String putNormal() {
        return "{\n" +
                "  \"username\": \"name1\",\n" +
                "  \"age\": 22\n" +
                "}";
    }

    @Language("JSON")
    private String putAbnormal() {
        return "{\n" +
                "  \"id\": 12,\n" +
                "  \"username\": \"name1\",\n" +
                "  \"age\": 22\n" +
                "}";
    }

}