package com.desafio.maisvida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.maisvida.entity.Candidato;
import com.desafio.maisvida.repository.CandidatoRepository;
import com.desafio.maisvida.service.CandidatoService;

@Service
public class CandidatoServiceImpl implements CandidatoService{
	
	@Autowired
	private CandidatoRepository repository;

	@Override
	public void create(Candidato candidato) {
		repository.save(candidato);
		
	}

	@Override
	public void apaga() {
		repository.deleteAll();
		
	}

}
