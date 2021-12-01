package main.java.br.ufrn.imd;

import main.java.br.ufrn.imd.dao.UsuarioDAO;
import main.java.br.ufrn.imd.modelo.Candidato;
import main.java.br.ufrn.imd.modelo.Empresa;
import main.java.br.ufrn.imd.modelo.OfertaDeVaga;
import main.java.br.ufrn.imd.modelo.Prova;
import main.java.br.ufrn.imd.modelo.OfertaDeVaga.status;

public class MainEmploymentNetwork {

	public static void main(String[] args) {
		Empresa e1 = new Empresa();
		Empresa e2 = new Empresa();
		Candidato c1 = new Candidato();
		Candidato c2 = new Candidato();

		e1.setNome("Omega Electric");
		e1.setCnpj("14.765.247/0001-03");
		
		e2.setNome("Tesla Electric");
		e2.setCnpj("37.409.640/0001-60");
		
		c1.setNome("Roberto da Silva");
		c1.setCpf("102.444.333-22");
		
		c2.setNome("Miguel da Silva");
		c2.setCpf("202.444.333-22");
		c2.setLogin("mig_silva");
		c2.setSenha("1234abcd");
		c2.setEmail("mig_silva100@gmail.com");
		c2.setFoto("Feio");
		
		UsuarioDAO udao = new UsuarioDAO();

		udao.addUsuario (e1);
		udao.addUsuario (e2);
		udao.addUsuario (c1);
		udao.addUsuario (c2);

		udao.remUsuario (c1);
		
		udao.listUsuarios();
		
		udao.updUsuario(c2, "brashi", "222bbb", "Lauro Bezerra", "lauroX@gmail.com", "Horrivel", "111.222.333-44");
		
		System.out.println();
		System.out.println();
		udao.listUsuarios();
		
		//Testando.
		OfertaDeVaga vaga = new OfertaDeVaga();
		vaga.addCandidato(c1);
		vaga.addCandidato(c2);
		vaga.setNome("Programador Full Stack");
		vaga.setDescricao("Desenvolver front e back");
		Prova prova1 = new Prova();
		Prova prova2 = new Prova();
		prova1.setNome("Linguagem de programacao");
		prova1.setDescricao("C++, Classes, OOP");
		vaga.addProva(prova1);
		prova2.setNome("Estrutura de Dados");
		prova2.setDescricao("Filas, Pilhas, Arvores");
		vaga.addProva(prova2);
		status estado = status.InscricoesAbertas;
		
		vaga.setEstado(estado);
		vaga.setEmpresa(e2);
		udao.addVaga(e2, vaga);
		
		System.out.println();
		udao.listVagas();
		
		
	}

}
