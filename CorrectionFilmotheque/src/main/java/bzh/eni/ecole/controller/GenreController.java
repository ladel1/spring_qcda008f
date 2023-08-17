package bzh.eni.ecole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import bzh.eni.ecole.bo.Genre;
import bzh.eni.ecole.service.FilmService;
import jakarta.validation.Valid;

@Controller
public class GenreController {

	@Autowired 
	@Qualifier("JPA")
	FilmService filmService;
	
	@GetMapping("/genres/ajouter")
	public String afficherFormulaire(Model model) {
		model.addAttribute("genre", new Genre());
		return "genre/add";
	}
	
	@PostMapping("/genres/ajouter")
	public String traiterFormulaire(
			@Valid @ModelAttribute Genre genre,
			BindingResult br
			) {
		
		if(br.hasErrors()) {
			return "genre/add";
		}		
		
		filmService.saveGenre(genre);		
		return "redirect:/films/ajouter";
	}
	
}
