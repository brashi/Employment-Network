package main.java.br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Empresa extends Usuario {
	protected String cnpj;
	protected ArrayList<OfertaDeVaga> vagas;
	
	public Empresa() {
		vagas = new ArrayList<OfertaDeVaga>();
	}
	
	public ArrayList<OfertaDeVaga> getVagas() {
		return vagas;
	}
	
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

	
}
