package com.pruebas.excepciones;

import com.pruebas.excepciones.misexcepciones.PersonalizadaException;

public class Cuenta {
	private String titular;
    private double saldo;
    private EstadoCuenta estado;  //EstadoCuenta.OPERATIVA
    
    
    public Cuenta(String titular, double saldo, EstadoCuenta estado) {
            super();
            this.titular = titular;
            this.saldo = saldo;
            this.estado = estado;
    }

    
    public double reintegro(double cantidad) throws Exception {
             if (cantidad <0) throw new PersonalizadaException("LA cantidad no puede ser negativa");
              // tendremos que lanzar una excepción personalizada
    
            return saldo;
    }
    
    public EstadoCuenta estadoCuenta() throws Exception {
        if (estado.name().equalsIgnoreCase("Bloqueada")) throw new PersonalizadaException("Tienes la cuenta bloqueada");
         // tendremos que lanzar una excepción personalizada

       return estado;
}
}
