package com.brixton.gestiontareas.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private String username;
    private String pwd;
    //private String rol;
}
