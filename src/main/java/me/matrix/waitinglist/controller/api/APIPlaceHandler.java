package me.matrix.waitinglist.controller.api;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.*;

import java.net.URI;
import java.util.List;

import static org.springframework.web.servlet.function.ServerResponse.*;

/**
 * author         : Jason Lee
 * date           : 2023-06-19
 * description    :
 */
@Component
public class APIPlaceHandler {

    public ServerResponse getPlaces(ServerRequest request) {
        return ok().body(List.of("place1", "place2"));
    }

    public ServerResponse createPlace(ServerRequest request) {
        return created(URI.create("/api/places/1")).body(true); //TODO: 1은 구현할 때 제대로 넣어주자
    }

    public ServerResponse getPlace(ServerRequest request) {
        return ok().body("place" + request.pathVariable("placeId"));
    }

    public ServerResponse modifyPlace(ServerRequest request) {
        return ok().body(true);
    }

    public ServerResponse removePlace(ServerRequest request) {
        return ok().body(true);
    }

}
