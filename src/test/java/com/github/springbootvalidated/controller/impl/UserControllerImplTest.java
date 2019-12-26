package com.github.springbootvalidated.controller.impl;

import com.alibaba.fastjson.JSON;
import com.github.springbootvalidated.pojo.doo.UserInfoDO;
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
 * 创建时间为 下午9:25 2019/9/27
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
public class UserControllerImplTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void createUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON).content(JSON.toJSONString(createUserInfoDO())))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value("id"))
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @Test
    public void passCheck() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user/118/11"))
                .andDo(print())
                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.length()").value(2))
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    private UserInfoDO createUserInfoDO() {
        return UserInfoDO.builder()
                .gender("male")
//                .id("id")
//                .role("AA")
                .username("name")
                .password("pass")
                .build();
    }


}