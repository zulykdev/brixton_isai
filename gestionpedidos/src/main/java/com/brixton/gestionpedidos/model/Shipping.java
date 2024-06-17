package com.brixton.gestionpedidos.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Shipping {
    private int id;
    private String trackNumber;
    private String address;
    private TypeStatus status;


}
