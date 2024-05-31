package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pokemon;
import com.curso.service.PokemonService;

@RestController
public class PokemonController {
	
	@Autowired
	private PokemonService pokemonService;
	
	@PostMapping(value = "pokemon", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void savePokemon(@RequestBody Pokemon pokemon) {
		pokemonService.savePokemon(pokemon);
	}
	
	@PutMapping(value = "pokemon", consumes = MediaType.APPLICATION_JSON_VALUE)
	void updatePokemon(@RequestBody Pokemon pokemon) {
		pokemonService.updatePokemon(pokemon);
	}
	
	@DeleteMapping(value = "pokemon", consumes = MediaType.APPLICATION_JSON_VALUE)
	void deletePokemon(@RequestBody Pokemon pokemon) {
		pokemonService.deletePokemon(pokemon);
	}
	
	@GetMapping(value = "pokemon", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pokemon> getPokemons(){
		return pokemonService.getPokemons();
	}
	@GetMapping(value = "pokemon/{min}/{max}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pokemon> getpokemonsInDamageRange(@PathVariable Integer min,@PathVariable Integer max) {
		return pokemonService.getPokemonsInDamageRange(min, max);
	}
	
	@GetMapping(value = "pokemon/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Pokemon getPokemonById(@PathVariable Integer id) {
		return pokemonService.getPokemonById(id);
	}
	
	@GetMapping(value = "pokemon/tipo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pokemon> getPokemonByTipo(@RequestParam("tipo") String tipo) {
		return pokemonService.getPokemonsByTipo(tipo);
	}
	
	@GetMapping(value = "pokemon/ataqueEspecial", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pokemon> filterPokemonsByAtaqueEspecial(@RequestParam("ataque") String ataqueEspecial) {
		return pokemonService.filterPokemonsByAtaqueEspecial(ataqueEspecial);
	}
	
}
