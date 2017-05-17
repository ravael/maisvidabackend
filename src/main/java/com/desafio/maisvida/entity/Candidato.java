package com.desafio.maisvida.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "candidatos")
public class Candidato {

	@Id
	private String id;
	
	private String email;
	private String senha;
	
	public Candidato(){}
	
	public Candidato(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
