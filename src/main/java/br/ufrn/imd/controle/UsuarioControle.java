package br.ufrn.imd.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.ufrn.imd.modelo.Candidato;
import br.ufrn.imd.service.CandidatoService;

@Controller
public class UsuarioControle {
	private CandidatoService candidatoService;
	
	public UsuarioControle(CandidatoService candidatoService) {
		super();
		this.candidatoService = candidatoService;
	}
	
	@GetMapping("/candidatos")
	public String listCandidatos(Model model) {
		model.addAttribute("candidatos", candidatoService.getAllCandidatos());
		return "candidatos";
	}
	
	@GetMapping("/candidatos/new")
	public String criarCandidatoForm(Model model) {
		Candidato candidato = new Candidato();
		model.addAttribute("candidato", candidato);
		return "novo_candidato";
	}
	
	@PostMapping("/candidatos")
	public String salvarCandidato(@ModelAttribute("candidato") Candidato candidato) {
		candidatoService.saveCandidato(candidato);
		return "redirect:/candidatos";
	}
	
	@GetMapping("/candidatos/edit/{id}")
	public String editarCandidatosForm(@PathVariable Long id, Model model) {
		model.addAttribute("candidato", candidatoService.getCandidatoById(id));
		return "editar_candidato";
	}
	
	@PostMapping("/candidatos/{id}")
	public String updateCandidato(@PathVariable Long id,
					@ModelAttribute("Candidatos") Candidato candidato,
					Model model) {
		
		Candidato canExistente = candidatoService.getCandidatoById(id);
		canExistente.setNome(candidato.getNome());
		canExistente.setEmail(candidato.getEmail());
		canExistente.setCpf(candidato.getCpf());
		canExistente.setFoto(candidato.getFoto());
		canExistente.setLogin(candidato.getLogin());
		canExistente.setSenha(candidato.getSenha());
		canExistente.setTipo(candidato.getTipo());
		
		candidatoService.updateCandidato(canExistente);
		return "redirect:/candidatos";
	}
	
	@GetMapping("/candidatos/{id}")
	public String deleteCandidato(@PathVariable Long id) {
		candidatoService.deleteCandidatoById(id);
		return "redirect:/candidatos";
	}
	
}
