package com.sinensia.biblioteca;

import com.sinensia.libro.Libro;

public class Main {
		public static void main(String[] args) {
			Libro manzana = new Libro();
			manzana.setAutor("Pedro");
			manzana.setTitulo("Muchas manzanas");
			manzana.setNumPaginas(200);
			manzana.setIsbn("000-ABC-146");
			
			Libro manzana2 = new Libro();
			System.out.println(manzana2.getTitulo());
			
			System.out.println(manzana);//Imprimir objeto libro
			
			Libro coche = new Libro(); 
			coche.setAutor("Maria");
			coche.setTitulo("Coches verdes");
			coche.setNumPaginas(10);
			coche.setIsbn("000-ABC-146");
			
			System.out.println(coche);//Imprimir objeto libro
			
			StringBuilder mostrarPantalla = new StringBuilder();
			if(manzana.getNumPaginas() > coche.getNumPaginas()) {
				mostrarPantalla.append(manzana.getTitulo() + " del autor " +  manzana.getAutor() + " tiene mas paginas" + "("+manzana.getNumPaginas()+")");
						;
			}else if (manzana.getNumPaginas() < coche.getNumPaginas()) {
				mostrarPantalla.append(coche.getTitulo().toString() + "de: "+ coche.getAutor().toString() + "BBB tiene mas paginas" + "("+manzana.getNumPaginas()+")");
				
			} else mostrarPantalla.append("Ambos libros tienen las mismas paginas"); 
			
			System.out.println(mostrarPantalla.toString());
		}
}
