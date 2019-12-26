package com.github.springbootvalidated.controller.impl;

import com.alibaba.fastjson.JSON;
import com.github.springbootvalidated.pojo.dto.BookInfoDTO;
import com.github.springbootvalidated.pojo.dto.UserInfoDTO;
import com.google.common.collect.Sets;
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
    public void createUser1() throws Exception {
        UserInfoDTO userInfo = UserInfoDTO.builder()
                .username("ShaoDong")
                .age(11)
                .bookInfo(BookInfoDTO.builder().name("TestName").build())
                .names(Sets.newHashSet("123"))
                .build();
        String data = JSON.toJSONString(userInfo);
        mockMvc.perform(MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON).content(data))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username").value("ShaoDong"))
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @Test
    public void createUser2() throws Exception {
        UserInfoDTO userInfo = UserInfoDTO.builder()
                .username("ShaoDong")
                .age(11)
                .bookInfo(BookInfoDTO.builder().build())
                .names(Sets.newHashSet("1"))
                .build();
        String data = JSON.toJSONString(userInfo);
        mockMvc.perform(MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON).content(data))
                .andDo(print())
                .andExpect(status().isBadRequest())
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

}