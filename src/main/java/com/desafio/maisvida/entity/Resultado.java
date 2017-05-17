package com.desafio.maisvida.entity;

public class Resultado {
	
	private String mensagem;
	private Integer status;
	
	public Resultado(String mensagem, Integer status) {
		super();
		this.mensagem = mensagem;
		this.status = status;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer i) {
		this.status = i;
		
	}
	
	

}
