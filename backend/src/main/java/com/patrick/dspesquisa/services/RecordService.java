package com.patrick.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patrick.dspesquisa.dto.RecordDTO;
import com.patrick.dspesquisa.dto.RecordInsertDTO;
import com.patrick.dspesquisa.entities.Game;
import com.patrick.dspesquisa.entities.Record;
import com.patrick.dspesquisa.repositories.GameRepository;
import com.patrick.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameID());
		entity.setGame(game);
		
		entity = recordRepository.save(entity);
		
		return new RecordDTO(entity);
	}

	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {		
		return recordRepository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}

}
