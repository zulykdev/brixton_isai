package com.brixton.gestionpedidos.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class Invoice {
    private int id;
    private int orderId;
    private LocalDate fechaFactura;
    private double total;
}
