package com.brixton.gestiontareas.model;

public enum TypeNotify {
    NEW_TASK(1, "NEW_TASK"),
    ASSIGNED_TASK(2, "ASSIGNED_TASK"),
    NEXT_DUE(3, "NEXT_DUE"),
    DEFEATED(4, "DEFEATED");

    private final int code;
    private final String description;
    TypeNotify(int code, String description){
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
