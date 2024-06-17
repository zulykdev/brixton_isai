package com.brixton.gestionpedidos.model;

import lombok.ToString;

@ToString
public enum TypeStatus {
    PREPARING(1, "PREPARING"),
    SENT(2, "SENT"),
    IN_TRANSIT(3, "IN_TRANSIT"),
    DELIVERED(4, "DELIVERED");

    private final int code;
    private final String description;
    TypeStatus(int code, String description){
        this.code = code;
        this.description = description;
    }
    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
    /*
    private String status;

    TypeStatus(String status){
        this.status = status;
    }

    public String getStatus(){return this.status; }*/



}
