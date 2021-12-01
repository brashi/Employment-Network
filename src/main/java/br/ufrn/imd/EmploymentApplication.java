package br.ufrn.imd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.ufrn.imd.repository.CandidatoRepository;

@SpringBootApplication
public class EmploymentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmploymentApplication.class, args);
	}
	
	@Autowired
	private CandidatoRepository candidatoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	}
}
