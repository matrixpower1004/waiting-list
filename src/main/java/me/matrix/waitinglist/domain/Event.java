package me.matrix.waitinglist.domain;

import lombok.Data;
import me.matrix.waitinglist.constant.EventStatus;

import java.time.LocalDateTime;

/**
 * author         : Jason Lee
 * date           : 2023-06-18
 * description    :
 */
@Data
public class Event {

    private Long id;

    private Long placeId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String memo;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
