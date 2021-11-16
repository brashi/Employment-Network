package br.ufrn.imd.modelo;

public class Empresa extends Usuario {
	protected String cnpj;
	
	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public int idUsuario() {
		return (1);
	}
	
}
