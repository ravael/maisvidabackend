package com.desafio.maisvida.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.desafio.maisvida.entity.Cidade;

public interface CidadeRepository extends MongoRepository<Cidade, String>{

}
