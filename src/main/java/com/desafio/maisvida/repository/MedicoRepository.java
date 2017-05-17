package com.desafio.maisvida.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.desafio.maisvida.entity.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String>{

}
