package com.brixton.sodimac.model.client;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Cliente {
    private int id;
    private String address;
    private String phone;
    private String email;

}
