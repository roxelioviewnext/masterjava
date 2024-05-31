package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Pokemon;


public interface PokemonDao extends JpaRepository<Pokemon, Integer> {
	
	@Query("SELECT p FROM Pokemon p WHERE p.danhoAtaque > :min AND p.danhoAtaque < :max")
	List<Pokemon> getPokemonsInDamageRange(int min, int max);
	
	@Query("SELECT p FROM Pokemon p WHERE p.tipo LIKE :tipo")
	List<Pokemon> getPokemonsByTipo(String tipo);
	
	@Query("SELECT p FROM Pokemon p WHERE p.ataqueEspecial LIKE :ataqueEspecial")
	List<Pokemon> filterPokemonsByAtaqueEspecial(@Param("ataqueEspecial") String ataqueEspecial);
	
}
