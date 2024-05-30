package com.brixton.input.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class UserRequestDTO {
    int id;
    String userName;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;
    int userStatus;
}
