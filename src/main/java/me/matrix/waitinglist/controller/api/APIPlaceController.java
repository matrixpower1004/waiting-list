package me.matrix.waitinglist.controller.api;

import me.matrix.waitinglist.constant.PlaceType;
import me.matrix.waitinglist.dto.APIDataResponse;
import me.matrix.waitinglist.dto.PlaceDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author         : Jason Lee
 * date           : 2023-06-18
 * description    :
 */
@RequestMapping("/api")
@RestController
public class APIPlaceController {

    @GetMapping("/places")
    public APIDataResponse<List<PlaceDTO>> getPlaces() {
        return APIDataResponse.of(List.of(PlaceDTO.of(
                PlaceType.COMMON,
                "랄라배드민턴장",
                "경기도 남양주시 사릉로",
                "010-1234-5678",
                30,
                "신장개업"
        )));
    }

    @PostMapping("/places")
    public Boolean createPlaces() {
        return true;
    }

    @GetMapping("/places/{placeId}")
    public APIDataResponse<PlaceDTO> getPlaces(@PathVariable Integer placeId) {
        if (placeId.equals(2)) {
            return APIDataResponse.of(null);
        }

        return APIDataResponse.of(PlaceDTO.of(
                PlaceType.COMMON,
                "랄라배드민턴장",
                "경기도 남양주시 사릉로",
                "010-1234-5678",
                30,
                "신장개업"
        ));
    }

    @PutMapping("/places/{placeId}")
    public Boolean modifyPlaces(@PathVariable Integer placeId) {
        return true;
    }

    @DeleteMapping("/places/{placeId}")
    public Boolean removePlaces(@PathVariable Integer placeId) {
        return true;
    }

}
