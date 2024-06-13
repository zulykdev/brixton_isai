package com.brixton.gestionusuario.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class User extends ObjectAudit{
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Rol rol;
    //private List<Permission> permissions;
}
