package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Libro;

@Service
public class LibroServiceImp implements LibroService {
	public List<Libro> libros;

	public LibroServiceImp() {
		libros = new ArrayList<Libro>(List.of(new Libro(1, "Grecia", "ficcion"), new Libro(2, "Roma", "amor"),
				new Libro(3, "Perla", "novela"), new Libro(4, "Francia", "dictadura"),
				new Libro(5, "Galicia", "teatro")));
	}

	@Override
	public List<Libro> libros() {
		return libros;
	}

	@Override
	public Libro buscarLibro(int isbn) {
		return libros.stream().filter(libro -> libro.getIsbn() == isbn).findFirst().orElse(null);
	}

	@Override
	public void altaLibro(Libro libro) {
		if (!libros.contains(libro)) {
			libros.add(libro);
		}
	}

	@Override
	public void actualizarLibro(Libro libro) {
		libros.stream().filter(libro1 -> libro1.getIsbn() == libro.getIsbn()).forEach(lib -> {
			lib.setTitulo(libro.getTitulo());
			lib.setTematica(libro.getTematica());
		});

	}

	@Override
	public List<Libro> eliminarLibro(int isbn) {
		Libro libro = buscarLibro(isbn);
		if (libros.contains(libro)) {
			libros.remove(libro);
		}
		return libros;
	}

}
