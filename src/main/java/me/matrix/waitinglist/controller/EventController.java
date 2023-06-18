package me.matrix.waitinglist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author         : Jason Lee
 * date           : 2023-06-18
 * description    :
 */
@RequestMapping("/events")
@Controller
public class EventController {

    @GetMapping("/")
    public String events() {
        return "event/index";
    }

    @GetMapping("/{eventId}")
    public String eventDetail(@PathVariable Integer eventId) {
        return "event/detail";
    }

}
