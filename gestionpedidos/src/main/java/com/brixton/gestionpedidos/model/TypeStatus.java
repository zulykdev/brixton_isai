package com.brixton.gestionpedidos.model;

import lombok.ToString;

@ToString
public enum TypeStatus {
    PREPARING(0),
    SENT(1),
    IN_TRANSIT(2),
    DELIVERED(3);

    private Integer status;

    TypeStatus(Integer status) {
        this.status = status;
    }

    Integer getStatus() {
        return this.status;
    }
}
