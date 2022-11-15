package com.apps.accounts;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public abstract class RequestTestCase {
    @Autowired
    private MockMvc mockMvc;

    protected void assertResponse(String endPoint, Integer expectedStatusCode, String expectedResponse) throws Exception {
        ResultMatcher response = expectedResponse.isEmpty()
                        ? content().string("")
                        : content().json(expectedResponse);
        mockMvc
                .perform(get(endPoint))
                .andExpect(status().is(expectedStatusCode))
                .andExpect(response);
    }

    protected void assertRequestWithBody(String method, String endpoint, String body, Integer expectedStatusCode) throws Exception {
        mockMvc
                .perform(request(HttpMethod.valueOf(method), endpoint).content(body).contentType(APPLICATION_JSON))
                .andExpect(status().is(expectedStatusCode))
                .andExpect(content().string(""));
    }

    protected void assertRequest(String method, String endpoint, Integer expectedStatusCode) throws Exception {
        mockMvc
                .perform(request(HttpMethod.valueOf(method), endpoint))
                .andExpect(status().is(expectedStatusCode))
                .andExpect(content().string(""));
    }
}
