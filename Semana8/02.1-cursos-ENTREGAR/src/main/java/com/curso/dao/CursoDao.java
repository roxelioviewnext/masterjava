package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Curso;

public interface CursoDao extends JpaRepository<Curso, Integer>{
	
	@Query("SELECT c FROM Curso c WHERE c.precio > :min AND c.precio < :max")
	List<Curso> findCursosByPrecio(double min, double max);

}
