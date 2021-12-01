package main.java.br.ufrn.imd.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import main.java.br.ufrn.imd.modelo.Candidato;
import main.java.br.ufrn.imd.repository.CandidatoRepository;
import main.java.br.ufrn.imd.service.CandidatoService;

@Service
public class CandidatoServiceImpl implements CandidatoService {
	
	private CandidatoRepository candidatoRepo;
	
	public CandidatoServiceImpl(CandidatoRepository candidatoRepo) {
		super();
		this.candidatoRepo = candidatoRepo;
	}
	
	@Override
	public List<Candidato> getAllCandidatos() {
		// TODO Auto-generated method stub
		return candidatoRepo.findAll();
	}

	@Override
	public Candidato saveCandidato(Candidato candidato) {
		// TODO Auto-generated method stub
		return candidatoRepo.save(candidato);
	}

	@Override
	public Candidato getCandidatoById(Long id) {
		// TODO Auto-generated method stub
		return candidatoRepo.findById(id).get();
	}

	@Override
	public Candidato updateCandidato(Candidato candidato) {
		// TODO Auto-generated method stub
		return candidatoRepo.save(candidato);
	}

	@Override
	public void deleteCandidatoById(Long id) {
		// TODO Auto-generated method stub
		candidatoRepo.deleteById(id);
	}

}
