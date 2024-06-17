package com.brixton.gestionpedidos.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ShippingRequestDTO {
    private int id;
    private String trackNumber;
    private String address;
    private int status;
}
