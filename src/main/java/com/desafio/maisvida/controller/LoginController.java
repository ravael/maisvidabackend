package com.desafio.maisvida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.maisvida.entity.Candidato;
import com.desafio.maisvida.entity.Resultado;
import com.desafio.maisvida.repository.CandidatoRepositoryCustom;

@RestController
@RequestMapping(value="api")
public class LoginController {
	
//	@Autowired
//	private CandidatoRepository cadidatoRepository;
//	
	@Autowired
	private CandidatoRepositoryCustom custom;
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ResponseEntity<?> logar(@RequestBody Candidato candidato){
		
		
		Candidato c = custom.findCandidato(candidato);
		if (c != null){
			Resultado resultado = new Resultado("Logado com sucesso", HttpStatus.OK.value());
			return new ResponseEntity<Resultado>(resultado,HttpStatus.OK);
		}
		return new ResponseEntity<Resultado>(new Resultado("Erro ao logar", HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST);
		
	}
	

}
