package com.github.springbootvalidated.controller.impl;

import org.intellij.lang.annotations.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@AutoConfigureMockMvc
@ActiveProfiles("junit")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ValidMessageControllerTest extends AbstractController {


    private static final String PATH = "/message/language";

    @Test
    public void valid1() {
        postBadRequest(PATH, postAbnormal1());
    }

    @Test
    public void valid2() {
        postBadRequest(PATH, postAbnormal2());
    }


    @Language("JSON")
    private String postAbnormal1() {
        return "{\n" +
                "  \"username\": \"\"\n" +
                "}";
    }


    @Language("JSON")
    private String postAbnormal2() {
        return "{\n" +
                "  \"username\": \"123456\",\n" +
                "  \"password\": \"\",\n" +
                "  \"age\": 12\n" +
                "}";
    }

}