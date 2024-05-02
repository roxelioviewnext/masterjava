package com.cursojava.test.utilidades;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.cursojava.utilidades.Calculadora;

public class CalculadoraTest {

	@Test
	void testCalculadoraSumar() {
		Calculadora calculadora = new Calculadora();
		double sum = calculadora.sumar(2, 2);
		assertEquals(4, sum);
	}
	
	@Test
	void testCalculadoraRestar() {
		Calculadora calculadora = new Calculadora();
		double resta = calculadora.restar(10, 6);
		assertEquals(4, resta);
	}
	
	@Test
	void testCalculadoraMultiplicar() {
		Calculadora calculadora = new Calculadora();
		double mult = calculadora.multiplicar(3, 2);
		assertEquals(6, mult);
	}
	
	@Test
	void testCalculadoraDividir() {
		Calculadora calculadora = new Calculadora();
		double div = calculadora.dividir(8.0, 2.0);
		assertEquals(4, div);
	}
}
