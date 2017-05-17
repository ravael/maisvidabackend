package com.desafio.maisvida.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.desafio.maisvida.entity.Candidato;
import com.desafio.maisvida.repository.CandidatoRepositoryCustom;

@Service
public class CandidatoRepositoryCustomImpl implements CandidatoRepositoryCustom{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Candidato findCandidato(Candidato candidato) {
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(candidato.getEmail()).and("senha").is(candidato.getSenha()));

		Candidato resultado = mongoTemplate.findOne(query, Candidato.class);
		
		return resultado;
	}

}
