package com.brixton.gestionpedidos.model;

import com.brixton.gestionpedidos.dto.request.InvoiceRequestDTO;
import com.brixton.gestionpedidos.dto.request.ShippingRequestDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Order extends ObjectAudit{
    private int id;
    private List<OrderLine> ordersLine;
    private Client client;
    private Invoice invoice;
    private Shipping shipping;
    private String dateOrder;
}
