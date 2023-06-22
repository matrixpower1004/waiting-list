package me.matrix.waitinglist.dto;

import me.matrix.waitinglist.constant.ErrorCode;
import org.apiguardian.api.API;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * author         : Jason Lee
 * date           : 2023-06-21
 * description    :
 */
class APIDataResponseTest {

    @DisplayName("문자열 데이터가 주어지면, 표준 성공 응답을 생성한다.")
    @Test
    void givenStringData_whenCreatingResponse_thenReturnsSuccessful_Response() {
        // Given
        String data = "test data";

        // When
        APIDataResponse response = APIDataResponse.of(data);

        // Then
        assertThat(response).isNotNull()
                .isNotNull()
                .hasFieldOrPropertyWithValue("success", true)
                .hasFieldOrPropertyWithValue("errorCode", ErrorCode.OK.getCode())
                .hasFieldOrPropertyWithValue("message", ErrorCode.OK.getMessage())
                .hasFieldOrPropertyWithValue("data", data);
    }

    @DisplayName("데이터가 없을 때, 비어있는 표준 성공 응답을 생성한다.")
    @Test
    void givenNothing_whenCreatingResponse_thenReturnsEmptySuccessful_Response() {
        // Given

        // When
        APIDataResponse response = APIDataResponse.empty();

        // Then
        assertThat(response).isNotNull()
                .isNotNull()
                .hasFieldOrPropertyWithValue("success", true)
                .hasFieldOrPropertyWithValue("errorCode", ErrorCode.OK.getCode())
                .hasFieldOrPropertyWithValue("message", ErrorCode.OK.getMessage())
                .hasFieldOrPropertyWithValue("data", null);
    }

}
