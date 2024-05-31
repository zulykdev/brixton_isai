package com.brixton.input.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserResponseDTO {
    int id;
    String userName;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;
    int userStatus;
    String createdAt;
    String updateAt;
}
