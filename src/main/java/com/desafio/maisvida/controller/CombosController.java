package com.desafio.maisvida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.maisvida.entity.Cidade;
import com.desafio.maisvida.entity.Especialidade;
import com.desafio.maisvida.entity.UF;
import com.desafio.maisvida.repository.CidadeRepository;
import com.desafio.maisvida.repository.EspecialidadeRepository;
import com.desafio.maisvida.repository.UFRepository;

@RestController
@RequestMapping(value="combo")
public class CombosController {
	
	@Autowired
	private EspecialidadeRepository repository;
	
	@Autowired
	private UFRepository ufRepo;

	@Autowired
	private CidadeRepository cidadeRepo;
	
	@RequestMapping(value="/especialidades", method = RequestMethod.GET)
	public ResponseEntity<List<Especialidade>> listaEspecialidades(){
		List<Especialidade> especialidades = repository.findAll();
		return new ResponseEntity<List<Especialidade>>(especialidades,HttpStatus.OK);
	}
	
	@RequestMapping(value="/ufs", method = RequestMethod.GET)
	public ResponseEntity<List<UF>> ufs(){
		List<UF> ufs = ufRepo.findAll();
		return new ResponseEntity<List<UF>>(ufs, HttpStatus.OK);
	}
	
	@RequestMapping(value="/cidades", method = RequestMethod.GET)
	public ResponseEntity<List<Cidade>> cidades(){
		List<Cidade> cidades = cidadeRepo.findAll();
		return new ResponseEntity<List<Cidade>>(cidades, HttpStatus.OK);
	}
}
