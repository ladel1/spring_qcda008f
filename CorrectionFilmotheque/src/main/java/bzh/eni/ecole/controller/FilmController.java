package bzh.eni.ecole.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import bzh.eni.ecole.bo.Film;
import bzh.eni.ecole.bo.Genre;
import bzh.eni.ecole.bo.Participant;
import bzh.eni.ecole.service.FilmService;
import jakarta.annotation.PostConstruct;

@Controller
public class FilmController {

	@Autowired
	@Qualifier("JPA")
	private FilmService filmService;
	
//	@PostConstruct
//	public void init() {
//		System.out.println("*****************  Init ******************");
//		Genre g = new Genre(1L, "Action");
//		Participant acteur = new Participant(1L, "Richard", "Attenborough");
//		Participant realisateur = new Participant(1L,"Steven","Spielberg");
//		
//		Film f = new Film(1L, "Jurassic Park", 1993, 128, 
//				"Le film raconte l'histoire d'un milliardaire et son équipe de généticiens parvenant"
//				+ " à ramener à la vie des dinosaures grâce au clonage.", g, realisateur, List.of(acteur), 
//				null);
//		filmService.saveFilm(f);		
//	}
	
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
	
	@GetMapping("/films/ajouter")
	public String afficherForm(Model model ) {
		model.addAttribute("film",new Film());
		model.addAttribute("participants",filmService.getParticipants());
		model.addAttribute("genres",filmService.getGenres());
		return "film/add";
	}
	@PostMapping("/films/ajouter")
	public String tairterForm() {
		
		return "redirect:/films";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
