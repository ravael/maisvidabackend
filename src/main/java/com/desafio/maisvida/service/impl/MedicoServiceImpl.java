package com.desafio.maisvida.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.maisvida.entity.Medico;
import com.desafio.maisvida.repository.MedicoRepository;
import com.desafio.maisvida.service.MedicoService;

@Service
public class MedicoServiceImpl implements MedicoService{
	
	@Autowired
	private MedicoRepository medicoRepository;

	@Override
	public void edita(Medico medico) {
		Medico resultado = medicoRepository.findOne(medico.getId());
		resultado.setEmail(medico.getEmail());
		resultado.setEndereco(medico.getEndereco());
		resultado.setEspecialidade(medico.getEspecialidade());
		resultado.setIsAtivo(medico.getIsAtivo());
		resultado.setIsOcupado(medico.getIsOcupado());
		resultado.setPrimeiroNome(medico.getPrimeiroNome());
		resultado.setSegundoNome(medico.getSegundoNome());
		medicoRepository.save(resultado);
	}

	@Override
	public void salva(Medico medico) {
		medicoRepository.save(medico);
	}

	@Override
	public List<Medico> lista() {
		return medicoRepository.findAll();
	}

	@Override
	public Medico findById(String id) {
		return medicoRepository.findOne(id);
	}

}
