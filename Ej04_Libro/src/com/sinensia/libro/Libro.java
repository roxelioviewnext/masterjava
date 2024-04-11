package com.sinensia.libro;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	@Override
	public String toString() {
		return "El libro con ISBN: " + isbn + " creado por el autor " + autor + " tiene " + numPaginas + " paginas\n";
	}
	
	
	
}
