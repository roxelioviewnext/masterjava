package com.cuenta.application;

import java.util.Scanner;

import com.cuenta.banco.Cuenta;

public class Main {

	public static void main(String[] args) {
		Double cantidad = 200.00;
		Cuenta nuevaCuenta;

		nuevaCuenta = new Cuenta("Pedro", 100);

			cantidad = 200.00;
			nuevaCuenta.ingresar(cantidad);
			System.out.println("Cantidad final de tras el ingreso de saldo:" + nuevaCuenta.getCantidad());
			
			cantidad = 50.00;
			nuevaCuenta.retirar(cantidad);
			System.out.println("Cantidad final de tras la retirada de saldo:" + nuevaCuenta.getCantidad());

	}
}
