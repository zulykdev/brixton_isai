package com.brixtom.democlases.reservas;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TipoDocumento {
    private String numero;
    private DocumentoIdentificacion documento;

}
