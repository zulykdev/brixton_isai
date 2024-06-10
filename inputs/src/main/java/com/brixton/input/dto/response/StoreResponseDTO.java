package com.brixton.input.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreResponseDTO {
    int id;
    int petId;
    int quantity;
    String shipDate;
    String status;
    boolean complete;
    String createdAt;
    String createdBy;
    String updatedAt;
    String updatedBy;

}
