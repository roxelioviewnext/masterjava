package com.curso.service;

import java.util.List;
import com.curso.model.Curso;


public interface CursoService {
	
	List<Curso> saveCurso(Curso curso);
	
	List<Curso> deleteCurso(Curso curso);
	
	void updateDuracionCurso(int codigo, int duration);
	
	Curso findCurso(int codigo);
	
	List<Curso> findCursosByPrecio(double min, double max);
	
	
}
