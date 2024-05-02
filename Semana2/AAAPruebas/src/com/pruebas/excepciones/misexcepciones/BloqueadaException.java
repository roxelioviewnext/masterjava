package com.pruebas.excepciones.misexcepciones;

public class BloqueadaException extends Exception{
	String texto;

    public BloqueadaException(String texto) {
            super();
            this.texto = texto;
    }

    @Override
    public String toString() {
      return "ExceptionBloqueada [texto=" + texto +"]" ;
    }
}
