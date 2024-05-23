package com.curso.repository;

import com.curso.model.Noticia;

public interface NoticiaRepository {
	
	public Noticia findOne(String titulo);
	
	public Iterable<Noticia> findAll();
	
	public void save(Noticia noticia);
	
	public void delete(Noticia noticia);
}
