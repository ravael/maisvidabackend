package com.desafio.maisvida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.maisvida.entity.Cidade;
import com.desafio.maisvida.repository.CidadeRepository;
import com.desafio.maisvida.service.CidadeService;

@Service
public class CidadeServiceImpl implements CidadeService{

	@Autowired
	private CidadeRepository repository;
	
	@Override
	public void apaga() {
		// TODO Auto-generated method stub
		repository.deleteAll();
		
	}

	@Override
	public void cria(Cidade cidade) {
		// TODO Auto-generated method stub
		repository.save(cidade);
		
	}

}
