package com.brixton.gestionusuario.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Permission {
    private int id;
    private List<Rol> rol;
    private String description;
    private PermissionType permissionType;
}
