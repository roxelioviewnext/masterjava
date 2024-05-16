package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentarios")
public class Comentario {
	@Id
	private int id;
	
	private String texto;
	private String autor;

	@ManyToOne()
	@JoinColumn(name = "comentario")
	private Noticia noticia;
	
	public Comentario() {
	}

	public Comentario(int id, String texto, String autor) {
		super();
		this.id = id;
		this.texto = texto;
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public String getTexto() {
		return texto;
	}

	public String getAutor() {
		return autor;
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentario other = (Comentario) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comentario [id=");
		builder.append(id);
		builder.append(", texto=");
		builder.append(texto);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", noticia=");
		builder.append(noticia);
		builder.append("]");
		return builder.toString();
	}
	
	
}
