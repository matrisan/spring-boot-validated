package com.github.springbootvalidated.controller.impl;

import org.intellij.lang.annotations.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@AutoConfigureMockMvc
@ActiveProfiles("junit")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ValidCompositionControllerTest extends AbstractController {

    private static final String PATH = "/composition";


    @Test
    public void valid() {
        postBadRequest(PATH, abnormal());

    }

    @Language("JSON")
    private String abnormal() {
        return "{\n" +
                "  \"username\": \"name1\",\n" +
                "  \"number\": \"1234567\"\n" +
                "}";
    }
}