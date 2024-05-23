package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.LibroDao;
import com.curso.model.Libro;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDao libroDao;

	@Override
	public List<Libro> libros() {
		return libroDao.findAll();
	}

	@Override
	public Libro buscarLibro(int isbn) {
		return libroDao.findById(isbn).orElse(null);
	}

	@Override
	public void altaLibro(Libro libro) {
		libroDao.save(libro);
	}

	@Override
	public void actualizarLibro(Libro libro) {
		libroDao.save(libro);

	}

	@Override
	public void eliminarLibro(int isbn) {
		libroDao.deleteById(isbn);;

	}

}
