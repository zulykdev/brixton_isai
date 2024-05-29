package com.brixton.input.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class StoreGenericRequestDTO {
    int id;
    int petId;
    int quantity;
    String shipDate;
    String status;
    boolean complete;
}
