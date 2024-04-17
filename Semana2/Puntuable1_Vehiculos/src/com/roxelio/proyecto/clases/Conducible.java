package com.roxelio.proyecto.clases;

import java.time.LocalDateTime;

public interface Conducible {

	void avanzar(double metros);
	
	void retroceder(double metros);
	
	void parar();

	void arrancar();
	
}
