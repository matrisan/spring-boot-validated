package com.github.springbootvalidated.controller.impl;

import org.intellij.lang.annotations.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@AutoConfigureMockMvc
@ActiveProfiles("junit")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class ValidBasicControllerImplTest extends AbstractController {

    private static final String path = "/basic";

    @Test
    public void valid1() {
        postOk(path, buildNormal(), jsonPath("$.username").value("name"));
    }

    public void valid2() {
        postBadRequest(path, buildAbnormal());
    }

    /**
     * 数据
     *
     * @return {"username": "name","range": 7,"birthday": "2011-11-11"}
     */
    @Language("JSON")
    private String buildNormal() {
        return "{\n" +
                "  \"username\": \"name\",\n" +
                "  \"range\": 7,\n" +
                "  \"birthday\": \"2011-11-11\"\n" +
                "}";
    }


    /**
     * 数据
     *
     * @return {"username": "name1212","range": 7,"birthday": "2011-11-11"}
     */
    @Language("JSON")
    private String buildAbnormal() {
        return "{\n" +
                "  \"username\": \"name1212\",\n" +
                "  \"range\": 7,\n" +
                "  \"birthday\": \"2011-11-11\"\n" +
                "}";
    }


}