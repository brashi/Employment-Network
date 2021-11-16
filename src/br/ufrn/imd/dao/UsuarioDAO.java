package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Usuario;
import br.ufrn.imd.modelo.Empresa;
import br.ufrn.imd.modelo.Candidato;

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
		usuario.setId();
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

}
