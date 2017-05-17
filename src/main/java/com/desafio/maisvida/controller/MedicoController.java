package com.desafio.maisvida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.maisvida.entity.Medico;
import com.desafio.maisvida.entity.Resultado;
import com.desafio.maisvida.service.MedicoService;

@RestController
@RequestMapping(value="medico")
public class MedicoController {
	
	@Autowired
	private MedicoService service;
	
	@RequestMapping(value="/lista", method = RequestMethod.GET)
	public ResponseEntity<List<Medico>> listaMedicos(){
		 List<Medico> medicos = service.lista();
		 return new ResponseEntity<List<Medico>>(medicos, HttpStatus.OK);
	}
	
	@RequestMapping(value="/cadastra", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastra(@RequestBody Medico medico){
		service.salva(medico);
		Resultado resultado = new Resultado("Salvo com sucesso", HttpStatus.OK.value());
		return new ResponseEntity<Resultado>(resultado,HttpStatus.OK);
	}
	
	@RequestMapping(value="/edita", method = RequestMethod.PUT)
	public ResponseEntity<?> atualizar(@RequestBody Medico medico){
		service.edita(medico);
		Resultado resultado = new Resultado("Salvo com sucesso", HttpStatus.OK.value());
		return new ResponseEntity<Resultado>(resultado, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Medico> medicoPorId(@PathVariable("id") String id){
		Medico medico = service.findById(id);
		return new ResponseEntity<Medico>(medico, HttpStatus.OK);
	}
	
}
