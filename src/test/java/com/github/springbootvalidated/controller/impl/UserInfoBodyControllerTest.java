package com.github.springbootvalidated.controller.impl;

import com.alibaba.fastjson.JSON;
import com.github.springbootvalidated.pojo.UserInfoDO;
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
import org.springframework.web.bind.MethodArgumentNotValidException;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * <p>
 * 创建时间为 下午2:23 2019/9/4
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
public class UserInfoBodyControllerTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void updateUser1() throws Exception {
        UserInfoDO userInfo = UserInfoDO.builder()
                .id(2L)
                .username("name1")
                .password("pass1")
                .build();
        String data = JSON.toJSONString(userInfo);
        mockMvc.perform(MockMvcRequestBuilders.put("/user")
                .contentType(MediaType.APPLICATION_JSON).content(data))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username").value("name1"))
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @Test
    public void updateUser2() throws Exception {
        UserInfoDO userInfo = UserInfoDO.builder()
                .id(10L)
                .username("name1")
                .password("pass1")
                .build();
        String data = JSON.toJSONString(userInfo);
        mockMvc.perform(MockMvcRequestBuilders.put("/user")
                .contentType(MediaType.APPLICATION_JSON).content(data))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

}