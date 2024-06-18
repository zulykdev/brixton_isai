package com.brixton.gestionpedidos.model;

import lombok.ToString;

@ToString
public enum TypeStatus {
    PREPARING(1),
    SENT(2),
    IN_TRANSIT(3),
    DELIVERED(4);

    private Integer status;

    TypeStatus(Integer status) {
        this.status = status;
    }

    Integer getStatus() {
        return this.status;
    }
}
