package br.ufrn.imd.modelo;

public class Candidato extends Usuario {
	protected String cpf;
	
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int idUsuario() {
		return (2);
	}
	
}
