package com.proyecto.application;

import com.proyecto.model.Factura;
import com.proyecto.model.Pagina;

public class GestionImpresion {
	public static void main(String[] args) {
		 Pagina pagina = new Pagina(100, 20);
		 Factura factura = new Factura(100, 20, 1);
		 
		 //mostrar informes de las paginas
		 pagina.informeCorto();
		 pagina.informeLargo();
		 
		 //mostrar informes de las facturas
		 factura.informeCorto();
		 factura.informeLargo();
		
	}
}
