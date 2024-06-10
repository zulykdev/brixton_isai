package com.brixton.input.model;

public enum OrderStatusType {
    PLACED("PLACED"),
    APPROVED("APPROVED"),
    DELIVERED("DELIVERED");

    private String status;
    OrderStatusType(String status) { this.status=status; }
    String getStatus(){ return this.status; }
}
