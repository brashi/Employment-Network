package br.ufrn.imd.modelo;

import java.util.Date;

public class ProvaRespondida {
	protected Date data;
	protected String respostas;
	protected String observacao;
	protected Candidato candidato;
	
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	
	public String getRespostas() {
		return respostas;
	}
	
	public void setRespostas(String respostas) {
		this.respostas = respostas;
	}
	
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	public Candidato getCandidato() {
		return candidato;
	}
	
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
}
