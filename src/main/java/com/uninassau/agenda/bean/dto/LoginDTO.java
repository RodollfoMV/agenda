package com.uninassau.agenda.bean.dto;

public class LoginDTO {

	private String nome;
	private String login;
	
	public LoginDTO(String nome, String login) {
		super();
		this.nome = nome;
		this.login = login;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	
	
	
}
