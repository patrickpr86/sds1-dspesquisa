package com.patrick.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
