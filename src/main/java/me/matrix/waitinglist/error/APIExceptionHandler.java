package me.matrix.waitinglist.error;

import me.matrix.waitinglist.constant.ErrorCode;
import me.matrix.waitinglist.dto.APIErrorResponse;
import me.matrix.waitinglist.exception.GeneralException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * author         : Jason Lee
 * date           : 2023-06-20
 * description    :
 */
@RestControllerAdvice(annotations = RestController.class)
public class APIExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<APIErrorResponse> general(GeneralException e) {
        ErrorCode errorCode = e.getErrorCode();
        HttpStatus status = errorCode.isClientSideError() ?
                HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR;

        return ResponseEntity.status(status)
                .body(APIErrorResponse.of(
                        false, errorCode, errorCode.getMessage(e)
                ));
    }

    @ExceptionHandler
    public ResponseEntity<APIErrorResponse> exception(Exception e) {
        ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        return ResponseEntity.status(status)
                .body(APIErrorResponse.of(
                        false, errorCode, errorCode.getMessage(e)
                ));
    }



}
