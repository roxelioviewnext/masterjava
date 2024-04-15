package com.proyecto.application;

import java.util.ArrayList;
import java.util.List;

import com.proyecto.model.Factura;
import com.proyecto.model.Pagina;
import com.proyecto.service.Imprimible;

public class GestionImpresion {
	public static void main(String[] args) {
		 Imprimible pagina = new Pagina(100, 20);
		 Imprimible factura = new Factura(140, 1);
		 
		 List<Imprimible> informes = new ArrayList<>();
		 informes.add(factura);
		 informes.add(pagina);
		 
		 for (Imprimible imprimible : informes) {
			imprimible.informeCorto();
			imprimible.informeLargo();
		}
		
	}
}
