package me.matrix.waitinglist.controller.api;

import me.matrix.waitinglist.dto.APIDataResponse;
import me.matrix.waitinglist.dto.AdminRequest;
import me.matrix.waitinglist.dto.LoginRequest;
import org.springframework.web.bind.annotation.*;

/**
 * author         : Jason Lee
 * date           : 2023-06-18
 * description    :
 */
@RequestMapping("/api")
@RestController
public class APIAuthController {

    @PostMapping("/sign-up")
    public APIDataResponse<String> signUp(
            @RequestBody AdminRequest adminRequest) {
        return APIDataResponse.empty();
    }

    @PostMapping("/login")
    public APIDataResponse<String> login(
            @RequestBody LoginRequest loginRequest) {
        return APIDataResponse.empty();
    }

}
