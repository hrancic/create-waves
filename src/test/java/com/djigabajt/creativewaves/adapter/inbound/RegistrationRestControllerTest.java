package com.djigabajt.creativewaves.adapter.inbound;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RegistrationRestController.class)
class RegistrationRestControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void successfull_registration_returns_200_OK() throws Exception {
        // given
        String request = """
                {
                    "firstName": "John",
                    "lastName": "Doe"
                }
                """;
        // when + then
        mockMvc.perform(post("/api/v1/clients")
                .contentType("application/json")
                .content(request))
                .andExpect(status().isOk());
    }
}