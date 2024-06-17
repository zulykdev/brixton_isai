package com.brixton.gestionProduccion.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product extends ObjectAudit {
    private int id;
    private String name;
    private double price;
    private Category category;
    private Inventory inventory;



}
