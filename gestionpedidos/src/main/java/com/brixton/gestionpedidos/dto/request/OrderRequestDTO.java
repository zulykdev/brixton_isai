package com.brixton.gestionpedidos.dto.request;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class OrderRequestDTO {
    private int id;
    private List<OrderLineRequestDTO> ordersLine;
    private ClientRequestDTO client;
    private InvoiceRequestDTO invoice;
    private ShippingRequestDTO shipping;
    private String dateOrder;
}
