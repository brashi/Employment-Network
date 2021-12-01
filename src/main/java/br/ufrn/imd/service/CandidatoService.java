package main.java.br.ufrn.imd.service;

import java.util.List;

import main.java.br.ufrn.imd.modelo.Candidato;

public interface CandidatoService {
	List<Candidato> getAllCandidatos();
	
	Candidato saveCandidato(Candidato candidato);
	
	Candidato getCandidatoById(Long id);
	
	Candidato updateCandidato(Candidato candidato);
	
	void deleteCandidatoById(Long id);
	
}
