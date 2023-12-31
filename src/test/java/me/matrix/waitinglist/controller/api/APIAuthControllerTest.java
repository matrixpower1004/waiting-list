package me.matrix.waitinglist.controller.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.matrix.waitinglist.constant.ErrorCode;
import me.matrix.waitinglist.dto.AdminRequest;
import me.matrix.waitinglist.dto.LoginRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * author         : Jason Lee
 * date           : 2023-06-22
 * description    :
 */
@WebMvcTest(APIAuthController.class)
class APIAuthControllerTest {

    private final MockMvc mvc;
    private final ObjectMapper mapper;

    public APIAuthControllerTest(
            @Autowired MockMvc mvc,
            @Autowired ObjectMapper mapper
    ) {
        this.mvc = mvc;
        this.mapper = mapper;
    }

    @DisplayName("[API][POST] 관리자 가입 - 입력이 정상이면 회원 정보를 추가하고 안내 메시지 반환")
    @Test
    void givenAdminDetails_whenSignup_thenCreatesAdminAndReturns() throws Exception {
        // Given
        AdminRequest adminRequest = AdminRequest.of(
                "test@test.com",
                "testNick",
                "passwd",
                "010-1234-5678",
                "test memo"
        );

        // When & Then
        mvc.perform(
                        post("/api/sign-up")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(mapper.writeValueAsString(adminRequest))
                )
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.errorCode").value(ErrorCode.OK.getCode()))
                .andExpect(jsonPath("$.message").value(ErrorCode.OK.getMessage()));
    }

    @DisplayName("[API][POST] 로그인 - 등록된 유저 정보로 인증 요청하면 인증 통과")
    @Test
    void givenUsernameAndPassword_whenLoggingIn_thenCreatesAdminAndReturns() throws Exception {
        // Given
        LoginRequest loginRequest = LoginRequest.of(
                "test@test.com",
                "passwd");

        // When & Then
        mvc.perform(
                        post("/api/login")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(mapper.writeValueAsString(loginRequest))
                )
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.errorCode").value(ErrorCode.OK.getCode()))
                .andExpect(jsonPath("$.message").value(ErrorCode.OK.getMessage()));
    }

}
