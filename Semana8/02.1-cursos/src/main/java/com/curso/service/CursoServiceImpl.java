package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursoDao;
import com.curso.model.Curso;

import jakarta.transaction.Transactional;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoDao cursoDao;

	@Override
	@Transactional
	public List<Curso> saveCurso(Curso curso) {
		cursoDao.save(curso);

		return cursoDao.findAll();
	}

	@Override
	@Transactional
	public List<Curso> deleteCurso(Curso curso) {
		cursoDao.delete(curso);

		return cursoDao.findAll();
	}

	@Override
	@Transactional
	public void updateDuracionCurso(int codigo, int duration) {
		cursoDao.findById(codigo).ifPresent(e -> e.setDuracion(duration));
	}

	@Override
	public Curso findCurso(int codigo) {
		return cursoDao.findById(codigo).orElse(null);
	}

	@Override
	public List<Curso> findCursosByPrecio(double min, double max) {
		return cursoDao.findCursosByPrecio(min, max);
	}

	@Override
	public List<Curso> findCurso() {
		return cursoDao.findAll();
	}

}
