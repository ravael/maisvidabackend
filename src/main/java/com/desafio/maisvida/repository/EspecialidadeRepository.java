package com.desafio.maisvida.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.desafio.maisvida.entity.Especialidade;

public interface EspecialidadeRepository extends MongoRepository<Especialidade, String>{

}
