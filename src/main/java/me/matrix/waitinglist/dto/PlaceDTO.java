package me.matrix.waitinglist.dto;

import me.matrix.waitinglist.constant.PlaceType;

/**
 * author         : Jason Lee
 * date           : 2023-06-20
 * description    :
 */
public record PlaceDTO(
        PlaceType placeType,
        String placeName,
        String address,
        String phoneNumber,
        Integer capacity,
        String memo

) {
    public static PlaceDTO of(
            PlaceType placeType,
            String placeName,
            String address,
            String phoneNumber,
            Integer capacity,
            String memo
    ) {
        return new PlaceDTO(placeType, placeName, address, phoneNumber, capacity, memo);
    }
}
