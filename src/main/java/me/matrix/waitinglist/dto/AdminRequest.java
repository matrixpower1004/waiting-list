package me.matrix.waitinglist.dto;

/**
 * author         : Jason Lee
 * date           : 2023-06-22
 * description    :
 */
public record AdminRequest(
        String email,
        String nickname,
        String password,
        String phoneNumber,
        String memo
) {
    public static AdminRequest of(
            String email,
            String nickname,
            String password,
            String phoneNumber,
            String memo
    ) {
        return new AdminRequest(email, nickname, password, phoneNumber, memo);
    }
}
