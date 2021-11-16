package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class OfertaDeVaga {
	protected String nome;
	protected String descricao;
	protected Empresa empresa;
	protected ArrayList<String> listaDeDocumentos;
	
	protected ArrayList<Prova> listaDeProvas;
	protected ArrayList<Candidato> candidatos;
	protected enum status {
		InscricoesAbertas,
		InscricoesFechadas,
		Finalizada;
	}
	
	protected status estado;
	
	public OfertaDeVaga() {
		candidatos = new ArrayList<Candidato>();
		listaDeProvas = new ArrayList<Prova>();
		listaDeDocumentos = new ArrayList<String>();
	}
	
	/**
	 * @return pegar o array de candidatos
	 */
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	
	/**
	 * @param adicionar candidato no array
	 */
	public void addCandidato(Candidato candidato) {
		candidatos.add(candidato);
	}
	
	/**
	 * @param remover candidato do array
	 */
	public void remCandidato(Candidato candidato) {
		candidatos.remove(candidato);
	}
	
	public void listarCandidatos() {
	}
	
	
	/**
	 * @param adicionar uma prova ao array
	 */
	public void addProva(Prova prova) {
		listaDeProvas.add(prova);
	}
	
	/**
	 * @param remove a prova do array
	 */
	public void remProva(Prova prova) {
		listaDeProvas.remove(prova);
	}
	
	public void listarProvas() {
	}
	
	
	/**
	 * @param adicionar um documento ao array
	 */
	public void addDocumento(String documento) {
		listaDeDocumentos.add(documento);
	}
	
	
	/**
	 * @param remove o documento do array
	 */
	public void remDocumento(String documento) {
		listaDeDocumentos.remove(documento);
	}
	
	public void listarDocumentos() {
	}
	
	
	/**
	 * @return nome da vaga
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome da vaga
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return descrição da vaga
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * @param descricao da vaga
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * @return empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}
	
	/**
	 * @param empresa
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	/**
	 * @return estado da prova (inscrições abertas, fechadas ou finalizada)
	 */
	public status getEstado() {
		return estado;
	}
	
	
	/**
	 * @param estado da prova
	 */
	public void setEstado(status estado) {
		this.estado = estado;
	}
	
	
	
	
	

	
	
}
