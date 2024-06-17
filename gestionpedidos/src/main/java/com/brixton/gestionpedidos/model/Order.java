package com.brixton.gestionpedidos.model;

import com.brixton.gestionpedidos.dto.request.ClientRequestDTO;
import com.brixton.gestionpedidos.dto.request.InvoiceRequestDTO;
import com.brixton.gestionpedidos.dto.request.ShippingRequestDTO;
import com.brixton.gestionpedidos.dto.request.orderLineRequestDTO;
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
    private InvoiceRequestDTO invoice;
    private ShippingRequestDTO shipping;
    private String dateOrder;
}
