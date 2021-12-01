package main.java.br.ufrn.imd.modelo;

public class Prova {
	protected String descricao;
	protected String nome;
	protected ProvaRespondida provaResp;
	
	/**
	 * @return descricao da prova
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * @param descricao da prova
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	/**
	 * @return nome da prova
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome da prova
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return prova respondida do aluno
	 */
	public ProvaRespondida getProvaResp() {
		return provaResp;
	}
	
	/**
	 * @return prova respondida do aluno
	 */
	public void setProvaRespondida(ProvaRespondida provaResp) {
		this.provaResp = provaResp;
	}
}
