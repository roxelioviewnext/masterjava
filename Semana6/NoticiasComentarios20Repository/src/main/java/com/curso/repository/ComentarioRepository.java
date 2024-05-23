package com.curso.repository;

import com.curso.model.Comentario;

public interface ComentarioRepository {
	
	public Comentario findOne(int num);
	
	public Iterable<Comentario> findAll();
	
	public void save(Comentario comentario);
	
	public void delete(Comentario comentario);
}
