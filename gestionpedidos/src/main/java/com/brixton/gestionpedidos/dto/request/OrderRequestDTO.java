package com.brixton.gestionpedidos.dto.request;


import com.brixton.gestionpedidos.dto.generic.InvoiceDTO;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class OrderRequestDTO {
    private int id;
    private InvoiceDTO invoice;
    private ShippingRequestDTO shipping;
    private String dateOrder;
}
