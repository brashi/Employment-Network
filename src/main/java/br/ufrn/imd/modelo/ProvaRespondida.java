package br.ufrn.imd.modelo;

import java.util.Date;

public class ProvaRespondida {
	protected Date data;
	protected String respostas;
	protected String observacao;
	protected Candidato candidato;
	
	/**
	 * @return data da prova
	 */
	public Date getData() {
		return data;
	}
	
	/**
	 * @param data da prova
	 */
	public void setData(Date data) {
		this.data = data;
	}
	
	
	/**
	 * @return respostas
	 */
	public String getRespostas() {
		return respostas;
	}
	
	
	/**
	 * @param respostas da prova
	 */
	public void setRespostas(String respostas) {
		this.respostas = respostas;
	}
	
	
	/**
	 * @return observacoes
	 */
	public String getObservacao() {
		return observacao;
	}
	
	/**
	 * @param observacoes
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	/**
	 * @return candidato
	 */
	public Candidato getCandidato() {
		return candidato;
	}
	
	/**
	 * @param candidato
	 */
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
}
