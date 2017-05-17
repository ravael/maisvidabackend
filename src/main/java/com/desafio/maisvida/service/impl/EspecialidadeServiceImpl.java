package com.desafio.maisvida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.maisvida.entity.Especialidade;
import com.desafio.maisvida.repository.EspecialidadeRepository;
import com.desafio.maisvida.service.EspecialidadeService;

@Service
public class EspecialidadeServiceImpl implements EspecialidadeService{
	
	@Autowired
	private EspecialidadeRepository repository;

	@Override
	public void apaga() {
		repository.deleteAll();
		
	}

	@Override
	public void cria(Especialidade especialidade) {
		repository.save(especialidade);
		
		
	}

}
