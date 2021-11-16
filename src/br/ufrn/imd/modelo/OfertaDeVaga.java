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
	
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	
	public void addCandidato(Candidato candidato) {
		candidatos.add(candidato);
	}
	
	public void remCandidato(Candidato candidato) {
		candidatos.remove(candidato);
	}
	
	public void listarCandidatos() {
	}
	
	
	public void addProva(Prova prova) {
		listaDeProvas.add(prova);
	}
	
	public void remProva(Prova prova) {
		listaDeProvas.remove(prova);
	}
	
	public void listarProvas() {
	}
	
	public void addDocumento(String documento) {
		listaDeDocumentos.add(documento);
	}
	
	public void remDocumento(String documento) {
		listaDeDocumentos.remove(documento);
	}
	
	public void listarDocumentos() {
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	public status getEstado() {
		return estado;
	}
	
	public void setEstado(status estado) {
		this.estado = estado;
	}
	
	
	
	
	

	
	
}
