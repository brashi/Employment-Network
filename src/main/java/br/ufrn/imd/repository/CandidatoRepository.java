package br.ufrn.imd.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.ufrn.imd.modelo.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
	
}
