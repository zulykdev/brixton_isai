package com.brixton.input.dto.request;

import lombok.Getter;

@Getter
public class PetGenericRequestDTO {
    int id;
    String name;
    String fechaNacimineto;
    CategoryRequestDTO category;
    String status;
    int age;
    String color;

}
