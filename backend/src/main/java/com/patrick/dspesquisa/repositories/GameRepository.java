package com.patrick.dspesquisa.repositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patrick.dspesquisa.entities.Game;
import com.patrick.dspesquisa.entities.Record;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

	
	

}
