package com.brixton.gestionpedidos.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order extends ObjectAudit{
    private int id;
    private Invoice invoice;
    private Shipping shipping;
    private String dateOrder;
}
