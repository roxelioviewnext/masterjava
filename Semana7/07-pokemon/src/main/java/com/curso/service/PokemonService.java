package com.curso.service;

import java.util.List;

import com.curso.model.Pokemon;

public interface PokemonService {

	void savePokemon(Pokemon pokemon);

	void updatePokemon(Pokemon pokemon);

	void deletePokemon(Pokemon pokemon);

	List<Pokemon> getPokemons();

	Pokemon getPokemonById(Integer id);

	List<Pokemon> getPokemonsInDamageRange(int min, int max);
	
	List<Pokemon> getPokemonsByTipo(String tipo);
	
	List<Pokemon> filterPokemonsByAtaqueEspecial(String ataqueEspecial);

}
