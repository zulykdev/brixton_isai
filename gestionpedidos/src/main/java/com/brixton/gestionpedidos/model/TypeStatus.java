package com.brixton.gestionpedidos.model;

import lombok.ToString;

@ToString
public enum TypeStatus {
    PREPARING("PREPARING"),
    SENT("SENT"),
    IN_TRANSIT("IN_TRANSIT"),
    DELIVERED("DELIVERED");

    private String status;

    TypeStatus(String status){
        this.status = status;
    }

    public String getStatus(){return this.status; }

}
