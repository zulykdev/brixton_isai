package com.brixton.gestionpedidos.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ShippingResponseDTO {
    private int id;
    private String trackNumber;
    private String address;
    private String status;
}
