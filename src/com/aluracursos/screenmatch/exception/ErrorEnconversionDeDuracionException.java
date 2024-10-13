package com.aluracursos.screenmatch.exception;

public class ErrorEnconversionDeDuracionException extends RuntimeException {
    private String mensaje;

    public ErrorEnconversionDeDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
