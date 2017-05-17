package com.desafio.maisvida.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.desafio.maisvida.entity.UF;

public interface UFRepository extends MongoRepository<UF, String>{

}
