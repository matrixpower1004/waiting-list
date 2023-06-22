package me.matrix.waitinglist.domain;

import lombok.Data;
import me.matrix.waitinglist.constant.PlaceType;

import java.time.LocalDateTime;

/**
 * author         : Jason Lee
 * date           : 2023-06-18
 * description    :
 */
@Data
public class Place {

    private Long id;

    private PlaceType placeType;
    private String placeName;
    private String address;
    private String phoneNumber;
    private Integer capacity;
    private String memo;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
