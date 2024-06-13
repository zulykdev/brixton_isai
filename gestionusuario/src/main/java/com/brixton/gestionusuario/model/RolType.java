package com.brixton.gestionusuario.model;

public enum RolType {
    ADMINISTRATOR("ADMINISTRATOR"),
    EDITOR("EDITOR"),
    INVITED("INVITED");

    private String rolType;
    RolType(String rolType) { this.rolType=rolType; }
    String getStatus(){ return this.rolType; }
}
