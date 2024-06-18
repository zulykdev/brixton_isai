package com.brixton.input.model;

public enum UserStatus {
    INACTIVE(0),
    ACTIVE(1);


    private Integer status;

    UserStatus(Integer status) {
        this.status = status;
    }

    Integer getStatus() {
        return this.status;
    }
}
