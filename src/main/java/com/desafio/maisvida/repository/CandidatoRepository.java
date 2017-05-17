package com.desafio.maisvida.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.desafio.maisvida.entity.Candidato;

public interface CandidatoRepository extends MongoRepository<Candidato, String>{
	
	@Query("{'email' : ?0, 'senha' : ?1}")
	public Candidato findCandidato(String email,String senha);
}
