package main.java.br.ufrn.imd.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import main.java.br.ufrn.imd.modelo.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
	
}
