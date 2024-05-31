package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.PokemonDao;
import com.curso.model.Pokemon;

import jakarta.transaction.Transactional;

@Service
public class PokemonServiceImpl implements PokemonService {

	@Autowired
	private PokemonDao pokemonDao;

	@Override
	public void savePokemon(Pokemon pokemon) {
		pokemonDao.save(pokemon);
	}

	@Override
	public void updatePokemon(Pokemon pokemon) {
		pokemonDao.findById(pokemon.getId()).ifPresent(e -> {
			e.setNombre(pokemon.getNombre());
			e.setHp(pokemon.getHp());
			e.setTipo(pokemon.getTipo());
			e.setAtaqueEspecial(pokemon.getAtaqueEspecial());
			e.setDanhoAtaque(pokemon.getDanhoAtaque());
			e.setDanhoAtaqueEspecial(pokemon.getDanhoAtaqueEspecial());
		});
	}

	@Override
	@Transactional
	public void deletePokemon(Pokemon pokemon) {
		pokemonDao.findById(pokemon.getId()).ifPresent(
				e-> pokemonDao.delete(e)
				);
		
	}

	@Override
	public List<Pokemon> getPokemons() {
		return pokemonDao.findAll();
	}

	@Override
	public Pokemon getPokemonById(Integer id) {
		return pokemonDao.findById(id).orElse(null);
	}

	@Override
	public List<Pokemon> getPokemonsInDamageRange(int min, int max) {
		return pokemonDao.getPokemonsInDamageRange(min, max);

	}

	@Override
	public List<Pokemon> getPokemonsByTipo(String tipo) {
		return pokemonDao.getPokemonsByTipo(tipo);
	}

	@Override
	public List<Pokemon> filterPokemonsByAtaqueEspecial(String ataqueEspecial) {
		return pokemonDao.filterPokemonsByAtaqueEspecial(ataqueEspecial);
	}

}
