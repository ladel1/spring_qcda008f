package bzh.eni.ecole.service;

import java.util.List;

import bzh.eni.ecole.bo.Film;
import bzh.eni.ecole.bo.Genre;
import bzh.eni.ecole.bo.Participant;
import jakarta.validation.Valid;

public interface FilmService {

	List<Film> getAllFilms();
	Film getFilmById(Long id);
	List<Genre> getGenres();
	List<Participant> getParticipants();
	Genre getGenreById(Long id);
	Participant getParticipantById(Long id);
	void saveFilm(Film film);
	void saveParticipant(@Valid Participant participant);
	void saveGenre(@Valid Genre genre);
	
}
