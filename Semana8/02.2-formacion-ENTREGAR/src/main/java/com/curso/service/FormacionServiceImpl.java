package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Curso;
import com.curso.model.Formacion;

@Service
public class FormacionServiceImpl implements FormacionService {

	private static final String URL_GET = "http://localhost:8080/cursos";

	private static final String URL_POST = "http://localhost:8080/cursos";

	private static final String URL_GET_BETWEEN = "http://localhost:8080/cursos/{min}/{max}";
	@Autowired
	RestTemplate template;

	@Override
	public List<Formacion> getFormaciones() {
		List<Curso> cursos = Stream.of(template.getForObject(URL_GET, Curso[].class)).toList();
		List<Formacion> formaciones = new ArrayList<Formacion>();

		for (Curso curso : cursos) {
			int asignaturas = curso.getDuracion() >= 50 ? 10 : 5;
			formaciones.add(new Formacion(curso.getNombre(), asignaturas, curso.getPrecio()));
		}

		return formaciones;
	}

	@Override
	public List<Formacion> getFormacionesBetween(@PathVariable int max, @PathVariable int min) {
		List<Curso> cursos = Arrays.asList(template.getForObject(URL_GET_BETWEEN, Curso[].class));

		List<Formacion> formaciones = new ArrayList<Formacion>();

		for (Curso curso : cursos) {
			int asignaturas = curso.getDuracion() >= 50 ? 10 : 5;
			formaciones.add(new Formacion(curso.getNombre(), asignaturas, curso.getPrecio()));
		}

		return formaciones;
	}

	@Override
	public void saveFormacion(Formacion formacion) {
		Optional<Formacion> formacionOptional = getFormaciones().stream()
				.filter(f -> f.getNombre().equals(formacion.getNombre())).findAny();

		if (!formacionOptional.isPresent()) {
			int duracion = formacion.getAsignaturas() * 10;

			Curso curso = new Curso(formacion.getNombre(), duracion, formacion.getPrecio());

			template.postForLocation(URL_POST, curso);
		}

	}

}
