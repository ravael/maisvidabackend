package com.desafio.maisvida.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medicos")
public class Medico {

	@Id
	private String id;
	
	private String primeiroNome;
	private String segundoNome;
	private String email;
	private Boolean isAtivo;
	private Boolean isOcupado;
	private Especialidade especialidade;
	private Endereco endereco;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSegundoNome() {
		return segundoNome;
	}
	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getIsAtivo() {
		return isAtivo;
	}
	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public Boolean getIsOcupado() {
		return isOcupado;
	}
	public void setIsOcupado(Boolean isOcupado) {
		this.isOcupado = isOcupado;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
