package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Candidato;
import br.ufrn.imd.modelo.Empresa;
import br.ufrn.imd.modelo.OfertaDeVaga;
import br.ufrn.imd.modelo.Prova;
import br.ufrn.imd.modelo.Usuario;

public class UsuarioDAO {
	public ArrayList<Usuario> usuarios;
	
	public UsuarioDAO() {
		usuarios = new ArrayList<Usuario>();
	}

	/**
	 * @return the usuarios
	 */
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void addUsuario (Usuario usuario) {
		usuarios.add(usuario);
	}

	public void remUsuario (Usuario usuario) {
		usuarios.remove(usuario);
	}
	
	public void updUsuario (Usuario usuario, String login, String senha, String nome, String email, String foto, String auxCnpjCpf) {
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setFoto(foto);
		if (usuario.getId() == 1) {
			((Empresa) usuario).setCnpj(auxCnpjCpf);
		} else {
			((Candidato) usuario).setCpf(auxCnpjCpf);
		}
	}
	
	public void listUsuarios() {
		for (Usuario usuario : usuarios) {
			System.out.println("********************************************************");
			if (usuario.getId() == 1) {
				System.out.println("Usuário: Empresa");
				System.out.println("CNPJ...: " + ((Empresa)  usuario).getCnpj());
			} else {
				System.out.println("Usuário: Candidato");
				System.out.println("CPF....: " + ((Candidato) usuario).getCpf());
			}
			System.out.println("Login..: " + usuario.getLogin());
			System.out.println("Nome...: " + usuario.getNome());
			System.out.println("Email..: " + usuario.getEmail());
			System.out.println("Foto...: " + usuario.getFoto());
		}
	}
	
	/*
	 * Metodos relacionados a vagas e provas.
	 */
	public void addVaga(Empresa empresa, OfertaDeVaga vaga) {
		empresa.getVagas().add(vaga);
	}
	
	public void remVaga(Empresa empresa, OfertaDeVaga vaga) {
		empresa.getVagas().remove(vaga);
	}
	
	public void listVagas() {
		for(Usuario usuario : usuarios) {
			if(usuario.getId() == 1) {
				for(OfertaDeVaga vaga : ((Empresa) usuario).getVagas()) {
					System.out.println("********************************************************");
					System.out.println("Vaga......: " + vaga.getNome());
					System.out.println("Descrição.: " + vaga.getDescricao());
					System.out.println("Empresa...: " + vaga.getEmpresa().getNome());
					System.out.println(vaga.getEstado());
					System.out.println("Candidatos: ");
					for(Candidato candidato : vaga.getCandidatos()) {
						System.out.println(" ---- " + candidato.getNome());
					}
					System.out.println("Provas: ");
					for(Prova prova : vaga.getProvas()) {
						System.out.println("Prova....: " + prova.getNome());
						System.out.println("Descrição: " + prova.getDescricao());
					}
					
				}
				
			}
		}
	}
	

}
