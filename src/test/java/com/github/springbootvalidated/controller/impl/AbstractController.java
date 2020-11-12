package com.github.springbootvalidated.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author 石少东
 * @date 2020-11-12 11:28
 * @since 1.0
 */

@SuppressWarnings("unused")
public abstract class AbstractController {

    protected static final ResultMatcher OK = status().isOk();

    protected static final ResultMatcher BAD_REQUEST = status().isBadRequest();

    @Resource
    protected MockMvc mockMvc;

    @Resource
    protected ObjectMapper objectMapper;

    @SneakyThrows
    protected void getOk(String url) {
        mockMvc.perform(MockMvcRequestBuilders.get(url))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @SneakyThrows
    protected void getOk(String url, ResultMatcher jsonPathMatcher) {
        mockMvc.perform(MockMvcRequestBuilders.get(url))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPathMatcher)
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @SneakyThrows
    protected void getBadRequest(String url) {
        mockMvc.perform(MockMvcRequestBuilders.get(url))
                .andDo(print())
                .andExpect(BAD_REQUEST)
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @SneakyThrows
    protected void postOk(String url, String data, ResultMatcher jsonPathMatcher) {
        mockMvc.perform(MockMvcRequestBuilders.post(url)
                .contentType(MediaType.APPLICATION_JSON).content(data))
                .andDo(print())
                .andExpect(OK)
                .andExpect(jsonPathMatcher)
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @SneakyThrows
    protected void postBadRequest(String url, String data) {
        mockMvc.perform(MockMvcRequestBuilders.post(url)
                .contentType(MediaType.APPLICATION_JSON).content(data))
                .andDo(print())
                .andExpect(BAD_REQUEST)
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @SneakyThrows
    protected void putOk(String url, String data, ResultMatcher jsonPathMatcher) {
        mockMvc.perform(MockMvcRequestBuilders.put(url)
                .contentType(MediaType.APPLICATION_JSON).content(data))
                .andDo(print())
                .andExpect(OK)
                .andExpect(jsonPathMatcher)
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @SneakyThrows
    protected void putBadRequest(String url, String data) {
        mockMvc.perform(MockMvcRequestBuilders.put(url)
                .contentType(MediaType.APPLICATION_JSON).content(data))
                .andDo(print())
                .andExpect(BAD_REQUEST)
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @SneakyThrows
    protected void deleteOk(String url, String data, ResultMatcher jsonPathMatcher) {
        mockMvc.perform(MockMvcRequestBuilders.delete(url)
                .contentType(MediaType.APPLICATION_JSON).content(data))
                .andDo(print())
                .andExpect(OK)
                .andExpect(jsonPathMatcher)
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

    @SneakyThrows
    protected void deleteBadRequest(String url, String data) {
        mockMvc.perform(MockMvcRequestBuilders.delete(url)
                .contentType(MediaType.APPLICATION_JSON).content(data))
                .andDo(print())
                .andExpect(BAD_REQUEST)
                .andReturn()
                .getResponse()
                .getContentAsString();
    }

}
