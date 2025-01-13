package com.proje1.pokemon.DAO;

import com.proje1.pokemon.entity.Pokemon;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PokemonDAOImpl implements PokemonDAO{


    private EntityManager entityManager; // jpa repistory kullan

    @Autowired
    public PokemonDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
@Transactional
    public void save(Pokemon thePokemon) {
        entityManager.persist(thePokemon);

    }
}
