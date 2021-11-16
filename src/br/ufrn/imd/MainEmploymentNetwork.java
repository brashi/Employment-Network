package br.ufrn.imd;

import br.ufrn.imd.dao.UsuarioDAO;
import br.ufrn.imd.modelo.Empresa;
import br.ufrn.imd.modelo.OfertaDeVaga;
import br.ufrn.imd.modelo.Prova;
import br.ufrn.imd.modelo.Candidato;

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
		
		udao.updUsuario(c2, "brashi", "222bbb", "Lauro", "lauroX@gmail.com", "Horrivel", "111.222.333-44");
		
		System.out.println();
		System.out.println();
		udao.listUsuarios();
		
		//Apenas alguns testes...
		OfertaDeVaga vaga = new OfertaDeVaga();
		vaga.addCandidato(c1);
		vaga.addCandidato(c2);
		Prova prova = new Prova();
		prova.setNome("Calculo 1");
		prova.setDescricao("Derivadas, integrais e Limites");
		
		
		System.out.println();
		System.out.println("Prova : " + prova.getNome() + "\n Candidatos: ");
		for(Candidato c : vaga.getCandidatos()) {
			System.out.println(c.getNome());
		}
		
		
	}

}
