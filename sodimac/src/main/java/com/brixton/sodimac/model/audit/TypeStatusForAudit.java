package com.brixton.sodimac.model.audit;

public enum TypeStatusForAudit {
    INACTIVE(0),
    ACTIVE(1);


    private Integer status;

    TypeStatusForAudit(Integer status) {
        this.status = status;
    }

    Integer getStatus() {
        return this.status;
    }
}
