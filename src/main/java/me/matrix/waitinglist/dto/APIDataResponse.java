package me.matrix.waitinglist.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * author         : Jason Lee
 * date           : 2023-06-19
 * description    :
 */
@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class APIDataResponse extends APIErrorResponse {

    private final Object data;

    private APIDataResponse(boolean success, Integer errorCode, String message, Object data) {
        super(success, errorCode, message);
        this.data = data;
    }

    public static APIDataResponse of(boolean success, Integer errorCode, String message, Object data) {
        return new APIDataResponse(success, errorCode, message, data);
    }

}
