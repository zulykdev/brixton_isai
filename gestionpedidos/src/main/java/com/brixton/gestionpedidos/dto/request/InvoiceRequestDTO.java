package com.brixton.gestionpedidos.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class InvoiceRequestDTO {
    private int id;
    private int orderId;
    private String fechaFactura;
    private double total;

}
