package com.brixton.sodimac.model;

public enum Role {
    ADMIN(0),
    SUPERVISOR(1),
    OPERATIVO(2);


    private Integer rol;

    Role(Integer rol) {
        this.rol = rol;
    }

    Integer getRol() {
        return this.rol;
    }
}
