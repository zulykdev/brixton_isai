package com.brixtom.democlases.tiendaonline;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Cliente {
    private String idCliente;
    private String nombreCliente;
    private  String eMail;
    private List<CarritoDeCompra> historialCompras;


}
