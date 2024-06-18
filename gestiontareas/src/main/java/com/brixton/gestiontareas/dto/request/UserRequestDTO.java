package com.brixton.gestiontareas.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserRequestDTO {
    private int id;
    private String name;
    private String username;
    private String pwd;
    //private String rol;
}
