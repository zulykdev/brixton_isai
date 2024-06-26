package com.brixton.input.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Pet extends ObjectAudit {

    Integer id;
    String name;
    LocalDate birthdate;
    Category category;
    PetStatusType status;
}
