package com.brixton.input.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Store extends ObjectAudit{
    Integer id;
    Integer petId;
    int quantity;
    LocalDate shipDate;
    OrderStatusType status;
    boolean complete;
}
