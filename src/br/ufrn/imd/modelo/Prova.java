package br.ufrn.imd.modelo;

public class Prova {
	protected String descricao;
	protected String nome;
	protected ProvaRespondida provaResp;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public ProvaRespondida getProvaResp() {
		return provaResp;
	}
	
	public void setProvaRespondida(ProvaRespondida provaResp) {
		this.provaResp = provaResp;
	}
}
