package com.brixton.gestionpedidos.dto.response;

import com.brixton.gestionpedidos.dto.generic.InvoiceDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponseDTO {
    private int id;
    private InvoiceDTO invoice;
    private ShippingResponseDTO shipping;
    private String dateOrder;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;


}
