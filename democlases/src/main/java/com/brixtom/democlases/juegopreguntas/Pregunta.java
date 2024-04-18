package com.brixtom.democlases.juegopreguntas;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Slf4j
public class Pregunta {
    private String enunciado;
    private List<String> opciones;
    private int respuestaCorrecta;

    public Pregunta(String enunciado, List<String> opciones, int respuestaCorrecta){
        setEnunciado(enunciado);
        setOpciones(new ArrayList<>(opciones));
        setRespuestaCorrecta(respuestaCorrecta);
    }
    public boolean verificarRespuesta(int indiceRespuesta) {
        return indiceRespuesta == respuestaCorrecta;
    }

}
