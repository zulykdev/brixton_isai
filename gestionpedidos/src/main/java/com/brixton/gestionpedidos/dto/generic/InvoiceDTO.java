package com.brixton.gestionpedidos.dto.generic;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class InvoiceDTO {
    private int id;
    private int orderId;
    private ClientDTO client;
    private String fechaFactura;
    private List<OrderLineDTO> ordersLine;
    private double total;

}
