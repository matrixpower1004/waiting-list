package me.matrix.waitinglist.dto;

/**
 * author         : Jason Lee
 * date           : 2023-06-22
 * description    :
 */
public record LoginRequest(
        String email,
        String password
) {
    public static LoginRequest of(
            String email,
            String password)
    {
        return new LoginRequest(email, password);
    }
}
