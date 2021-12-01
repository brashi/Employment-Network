package br.ufrn.imd.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Usuario {
	
	protected @Id @GeneratedValue Long id;
	@Column(name = "login", nullable = false)
	protected String login;
	
	@Column(name = "senha")
	protected String senha;
	
	@Column(name = "nome")
	protected String nome;
	
	@Column(name = "email")
	protected String email;
	
	@Column(name = "foto")
	protected String foto;
	
	
	
	public enum tipo {
		Empresa,
		Candidato
	}
	
	@Column(name = "tipo")
	@Enumerated(EnumType.STRING)protected tipo tipo;
	public tipo getTipo() {
		return this.tipo;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param tipo de usuario
	 */
	public void setTipo(tipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

}
