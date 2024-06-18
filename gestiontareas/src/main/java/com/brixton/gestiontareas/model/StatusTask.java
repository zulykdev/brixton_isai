package com.brixton.gestiontareas.model;

public enum StatusTask {
    PENDING(1, "PENDING"),
    FOR_ASSIGN(2, "FOR_ASSIGN"),
    IN_PROGRESS(3, "IN_PROGRESS"),
    COMPLETED(4, "COMPLETED");

    private final int code;
    private final String description;
    StatusTask(int code, String description){
        this.code = code;
        this.description = description;
    }
    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
