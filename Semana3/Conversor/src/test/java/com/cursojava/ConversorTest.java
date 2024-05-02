package com.cursojava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConversorTest {
	
	@Test
	void testConversorPesetasEuros() {
		Conversor conversor = new Conversor();
		double euros = conversor.convertirPesetasEuros(10000);
		assertEquals(60.0, 60.1, euros);
	}
	
	@Test
	void testConversorEurosPesetas() {
		Conversor conversor = new Conversor();
		double pesetas = conversor.convertirEurosPesetas(601);
		assertEquals(100000, 105000, pesetas);
	}
}
