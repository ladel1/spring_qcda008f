package bzh.eni.ecole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import bzh.eni.ecole.bo.Participant;
import bzh.eni.ecole.service.FilmService;
import jakarta.validation.Valid;

@Controller
public class ParticipantController {

	@Autowired 
	@Qualifier("JPA")
	FilmService filmService;
	
	@GetMapping("/participants/ajouter")
	public String afficherFormulaire(Model model) {
		model.addAttribute("participant", new Participant());
		return "participant/add";
	}
	
	@PostMapping("/participants/ajouter")
	public String traiterFormulaire(
			@Valid @ModelAttribute Participant participant,
			BindingResult br
			) {
		
		if(br.hasErrors()) {
			return "participant/add";
		}		
		
		filmService.saveParticipant(participant);		
		return "redirect:/films/ajouter";
	}
	
}
