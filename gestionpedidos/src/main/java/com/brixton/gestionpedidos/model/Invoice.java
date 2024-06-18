package com.brixton.gestionpedidos.model;

import com.brixton.gestionpedidos.dto.generic.OrderLineDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
public class Invoice {
    private int id;
    private int orderId;
    private Client client;
    private LocalDate fechaFactura;
    private List<OrderLine> ordersLine;
    private double total;
}
