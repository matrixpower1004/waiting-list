package me.matrix.waitinglist.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import me.matrix.waitinglist.constant.ErrorCode;

/**
 * author         : Jason Lee
 * date           : 2023-06-19
 * description    :
 */
@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class APIDataResponse<T> extends APIErrorResponse {

    private final T data;
    private APIDataResponse(T data) {
        super(true, ErrorCode.OK.getCode(), ErrorCode.OK.getMessage());
        this.data = data;
    }

    public static <T> APIDataResponse<T> of(T data) {
        return new APIDataResponse(data);
    }

}
