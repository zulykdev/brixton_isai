package com.brixton.gestionusuario.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserRequestDTO {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private RolRequestDTO rol;
    //private List<String> permission;
}
