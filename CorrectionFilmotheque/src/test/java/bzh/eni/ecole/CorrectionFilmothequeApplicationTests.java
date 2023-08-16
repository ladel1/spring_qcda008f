package bzh.eni.ecole;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import bzh.eni.ecole.bo.Film;
import bzh.eni.ecole.bo.Genre;
import bzh.eni.ecole.bo.Participant;
import bzh.eni.ecole.service.FilmService;

@SpringBootTest
class CorrectionFilmothequeApplicationTests {

	@Autowired
	private FilmService filmService;
	
	@Test
	void testAjout() {
		Genre g = new Genre(1L, "Action");
		Participant acteur = new Participant(1L, "Richard", "Attenborough");
		Participant realisateur = new Participant(1L,"Steven","Spielberg");
		
		Film f = new Film(1L, "Jurassic Park", 1993, 128, 
				"Le film raconte l'histoire d'un milliardaire et son équipe de généticiens parvenant"
				+ " à ramener à la vie des dinosaures grâce au clonage.", g, realisateur, List.of(acteur), 
				null);
		filmService.saveFilm(f);
		System.out.println("************* Films ***************");
		System.out.println(filmService.getAllFilms());
		
	}
	
	@Test
	void contextLoads() {
	}

}
