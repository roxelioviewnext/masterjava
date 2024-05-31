package com.curso.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pokemon {

	@Id
	private Integer id;
	
	private String nombre;
	private Integer hp;
	private String tipo;
	private String ataqueEspecial;
	private Integer danhoAtaque;
	private Integer danhoAtaqueEspecial;

	public Pokemon() {
	}

	public Pokemon(Integer id, String nombre, Integer hp, String tipo, String ataqueEspecial, Integer danhoAtaque,
			Integer danhoAtaqueEspecial) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.hp = hp;
		this.tipo = tipo;
		this.ataqueEspecial = ataqueEspecial;
		this.danhoAtaque = danhoAtaque;
		this.danhoAtaqueEspecial = danhoAtaqueEspecial;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(String ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	public Integer getDanhoAtaque() {
		return danhoAtaque;
	}

	public void setDanhoAtaque(Integer danhoAtaque) {
		this.danhoAtaque = danhoAtaque;
	}

	public Integer getDanhoAtaqueEspecial() {
		return danhoAtaqueEspecial;
	}

	public void setDanhoAtaqueEspecial(Integer danhoAtaqueEspecial) {
		this.danhoAtaqueEspecial = danhoAtaqueEspecial;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pokemon [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", hp=");
		builder.append(hp);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", ataqueEspecial=");
		builder.append(ataqueEspecial);
		builder.append(", dañoAtaque=");
		builder.append(danhoAtaque);
		builder.append(", dañoAtaqueEspecial=");
		builder.append(danhoAtaqueEspecial);
		builder.append("]");
		return builder.toString();
	}

}
