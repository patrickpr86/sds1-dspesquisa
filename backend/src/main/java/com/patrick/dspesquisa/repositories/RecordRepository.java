package com.patrick.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
