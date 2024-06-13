package com.brixton.gestionusuario.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Rol {
    private int id;
    //private User user;
    private RolType nameRol;
    private List<PermissionType> permissions;

}
