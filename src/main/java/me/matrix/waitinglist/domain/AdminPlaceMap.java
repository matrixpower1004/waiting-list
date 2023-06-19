package me.matrix.waitinglist.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * author         : Jason Lee
 * date           : 2023-06-18
 * description    :
 */
@Data
public class AdminPlaceMap {

    private Long id;

    private Long adminId;
    private Long PlaceId;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
