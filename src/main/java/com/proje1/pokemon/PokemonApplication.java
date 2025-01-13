package com.proje1.pokemon;

import com.proje1.pokemon.DAO.PokemonDAO;
import com.proje1.pokemon.entity.Pokemon;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PokemonDAO pokemonDAO) {
		return runner -> {
			createPokemon(pokemonDAO);
		};
	}

	private void createPokemon(PokemonDAO pokemonDAO) {

		System.out.println("Pokemon Oluşturuluyor..");
		Pokemon tempPokemon = new Pokemon("Persian", 65, 70, 60, 65, 115);


System.out.println("Pokemon Ozellikleri Kaydediliyor..");
pokemonDAO.save(tempPokemon);

		System.out.println("Pokemon Ozellikleri Kaydedildi. Id: " + tempPokemon.getId());

	}

}


