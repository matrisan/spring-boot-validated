package com.github.springbootvalidated.controller.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.springbootvalidated.pojo.dto.WebXssProtectDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * <p>
 * 创建时间为 下午4:14 2019/11/25
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@AutoConfigureMockMvc
@ActiveProfiles("junit")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class WebXssProtectControllerImplTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void check() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/body/check")
                .contentType(MediaType.APPLICATION_JSON).content(getWebXssProtectDTO()))
                .andDo(print())
                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id").value("11"))
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    private String getWebXssProtectDTO() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(
                WebXssProtectDTO.builder()
//                        .content("123")
                        .content("<a>blabla</a>")
//                        .content("<script>alert('blabla')</script>")
                        .script("456")
                        .build()
        );
    }

}