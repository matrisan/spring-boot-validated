package com.github.springbootvalidated.controller.impl;

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
public class ValidSequenceControllerTest extends AbstractController {

    private static final String PATH = "/sequence";

    private static final ResultMatcher jsonPathMatcher = jsonPath("$.username").value("name1");

    @Test
    public void valid() {
        postBadRequest(PATH, abnormal());
    }

    private String abnormal() {
        return "{\n" +
                "  \"username\": \"name1\",\n" +
                "  \"password\": \"1212\",\n" +
                "  \"age\": 12\n" +
                "}";
    }

}