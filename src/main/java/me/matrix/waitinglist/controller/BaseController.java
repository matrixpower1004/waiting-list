package me.matrix.waitinglist.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author         : Jason Lee
 * date           : 2023-06-18
 * description    :
 */
@Controller
public class BaseController implements ErrorController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @RequestMapping("/error")
    public String error() {
        return "error";
    }
}
