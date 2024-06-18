package com.brixton.gestionpedidos.dto.response;

import com.brixton.gestionpedidos.dto.request.ClientRequestDTO;
import com.brixton.gestionpedidos.dto.request.InvoiceRequestDTO;
import com.brixton.gestionpedidos.dto.request.ShippingRequestDTO;
import com.brixton.gestionpedidos.dto.request.OrderLineRequestDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class OrderResponseDTO {
    private int id;
    private List<OrderLineRequestDTO> ordersLine;
    private ClientRequestDTO client;
    private InvoiceRequestDTO invoice;
    private ShippingRequestDTO shipping;
    private String dateOrder;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;


}
