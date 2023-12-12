package com.uninassau.agenda.bean.dto;

import java.time.LocalDateTime;

public class CompromissoDTO {
	
	
	private LocalDateTime dataHora;
	private String titulo;
	private String descricao;
	private String local;
	private String responsavel;
	
	

	public CompromissoDTO(LocalDateTime dataHora, String titulo, String descricao, String local, String responsavel) {
		super();
		this.dataHora = dataHora;
		this.titulo = titulo;
		this.descricao = descricao;
		this.local = local;
		this.responsavel = responsavel;
	}
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
}
