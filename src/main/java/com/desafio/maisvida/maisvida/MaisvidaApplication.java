package com.desafio.maisvida.maisvida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.desafio.maisvida.entity.Candidato;
import com.desafio.maisvida.entity.Cidade;
import com.desafio.maisvida.entity.Especialidade;
import com.desafio.maisvida.entity.UF;
import com.desafio.maisvida.service.CandidatoService;
import com.desafio.maisvida.service.CidadeService;
import com.desafio.maisvida.service.EspecialidadeService;
import com.desafio.maisvida.service.UFService;

@SpringBootApplication
@ComponentScan("com.desafio.maisvida")
@EnableMongoRepositories("com.desafio.maisvida.repository")
public class MaisvidaApplication {
	
	@Autowired
	private CandidatoService candidatoService;
	
	@Autowired
	private EspecialidadeService especialidadeService;
	
	@Autowired
	private UFService ufService;
	
	@Autowired
	private CidadeService cidadeService;
	
	public static void main(String[] args) {
		SpringApplication.run(MaisvidaApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(CandidatoService candidatoService,EspecialidadeService especialidadeService,UFService ufService,CidadeService cidadeService) {
		return (args) -> {
			candidatoService.apaga();
			candidatoService.create(new Candidato("test@test", "test"));
			especialidadeService.apaga();
			especialidadeService.cria(new Especialidade("Cardiologista"));
			especialidadeService.cria(new Especialidade("Imunologista"));
			especialidadeService.cria(new Especialidade("Neurologista"));
			ufService.apaga();
			ufService.cria(new UF("DF"));
			ufService.cria(new UF("SP"));
			ufService.cria(new UF("RJ"));
			cidadeService.apaga();
			cidadeService.cria(new Cidade("Brasilia"));
			cidadeService.cria(new Cidade("Sao Paulo"));
			cidadeService.cria(new Cidade("Rio de Janeiro"));
		};
		
	}
}
