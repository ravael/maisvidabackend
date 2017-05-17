package com.desafio.maisvida.service;

import java.util.List;

import com.desafio.maisvida.entity.Medico;


public interface MedicoService {

	public void edita(Medico medico);
	public void salva(Medico medico);
	public List<Medico> lista();
	public Medico findById(String id);
}
