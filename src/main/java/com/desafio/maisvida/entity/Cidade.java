package com.desafio.maisvida.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cidades")
public class Cidade {
	
	@Id
	private String id;
	
	private String descricao;
	
	public Cidade(){}

	public Cidade(String descricao) {
		// TODO Auto-generated constructor stub
		this.descricao = descricao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
