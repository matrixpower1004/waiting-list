package me.matrix.waitinglist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * author         : Jason Lee
 * date           : 2023-06-18
 * description    :
 */
@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("sign-up")
    public String signUp() {
        return "auth/sign-up";
    }
}
