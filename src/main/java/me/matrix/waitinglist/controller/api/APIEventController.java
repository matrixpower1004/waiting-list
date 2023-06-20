package me.matrix.waitinglist.controller.api;

import me.matrix.waitinglist.exception.GeneralException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author         : Jason Lee
 * date           : 2023-06-18
 * description    :
 */
@RequestMapping("/api")
@RestController
public class APIEventController {

    @GetMapping("/events")
    public List<String> getEvents() throws Exception {
        throw new HttpRequestMethodNotSupportedException("스프링 에러 테스트");
//        return List.of("event1", "event2");
    }

    @PostMapping("/events")
    public Boolean createEvent() {
        throw new GeneralException("GeneralException 테스트");
//        return true;
    }

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable Integer eventId) {
        throw new RuntimeException("RuntimeException 테스트");
//        return "event " + eventId;
    }

    @PutMapping("/events/{eventId}")
    public Boolean modifyEvent(@PathVariable Integer eventId) {
        return true;
    }

    @DeleteMapping("/events/{eventId}")
    public Boolean removeEvent(@PathVariable Integer eventId) {
        return true;
    }

}
