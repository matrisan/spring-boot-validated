package com.github.springbootvalidated.controller.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.springbootvalidated.pojo.dto.UserClassDTO;
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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * <p>
 * 创建时间为 上午11:20 2019/11/20
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
public class UserClassValidControllerImplTest {

    @Resource
    private MockMvc mockMvc;

    @Resource
    private ObjectMapper objectMapper;

    @Test
    public void save() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/class")
                .contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(getUserClass())))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.field1").value("field1"))
                .andExpect(jsonPath("$.field2").value("field1"))
                .andReturn()
                .getResponse()
                .getContentAsString();

    }

    private UserClassDTO getUserClass() {
        return UserClassDTO.builder()
                .field1("field1")
                .field2("field1")
                .build();
    }

}