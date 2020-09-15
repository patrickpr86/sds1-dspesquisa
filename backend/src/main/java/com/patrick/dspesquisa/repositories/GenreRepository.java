package com.patrick.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
