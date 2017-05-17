package com.desafio.maisvida.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.desafio.maisvida.entity.Candidato;
import com.desafio.maisvida.repository.CandidatoRepository;
import com.desafio.maisvida.service.LoginService;

public class LoginServiceImpl implements LoginService{
	
	@Autowired
	CandidatoRepository candidatoRepository;

	@Override
	public void logar(Candidato candidato) {
		Candidato resultado = candidatoRepository.findCandidato(candidato.getEmail(), candidato.getSenha());
		if(resultado != null){
			
		}
	}

}
