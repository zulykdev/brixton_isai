package com.brixton.gestiontareas.dto.generic;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserDTO {
    private int id;
    private String name;
    private String username;
    private String pwd;
    //private String rol;
}
