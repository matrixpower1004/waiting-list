package me.matrix.waitinglist.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * author         : Jason Lee
 * date           : 2023-06-18
 * description    :
 */
@Data
public class Admin {

    private Long id;

    private String email;
    private String nickname;
    private String password;
    private String phoneNumber;
    private String memo;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
