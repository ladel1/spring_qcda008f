package bzh.eni.ecole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import bzh.eni.ecole.service.FilmService;

@Controller
public class FilmController {

	@Autowired
	private FilmService filmService;
	
	@GetMapping("/films/{id:[0-9]+}")
	public String details(@PathVariable Long id,Model model) {
		model.addAttribute("film",filmService.getFilmById(id));
		return "/film/details";
	}
	
	@GetMapping("/films")
	public String liste(Model model) {
		model.addAttribute("films",filmService.getAllFilms());
		return "/film/liste";
	}	
	
}
