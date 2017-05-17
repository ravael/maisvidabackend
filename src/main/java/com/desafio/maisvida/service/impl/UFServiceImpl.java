package com.desafio.maisvida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.maisvida.entity.UF;
import com.desafio.maisvida.repository.UFRepository;
import com.desafio.maisvida.service.UFService;

@Service
public class UFServiceImpl implements UFService{
	
	@Autowired
	private UFRepository repository;

	@Override
	public void apaga() {
		// TODO Auto-generated method stub
		repository.deleteAll();
		
	}

	@Override
	public void cria(UF uf) {
		// TODO Auto-generated method stub
		repository.save(uf);
		
	}

}
