package bzh.eni.ecole.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import bzh.eni.ecole.bo.Film;
import bzh.eni.ecole.bo.Genre;
import bzh.eni.ecole.bo.Participant;
import jakarta.validation.Valid;

@Service("MOCK")
public class FilmServiceMock implements FilmService {

	List<Film> lstFilms = new ArrayList<Film>();
	List<Genre> lstGenres = new ArrayList<Genre>();
	List<Participant> lstParticipants = new ArrayList<Participant>();
	
	
	@Override
	public List<Film> getAllFilms() {
		// TODO Auto-generated method stub
		return lstFilms;
	}

	@Override
	public Film getFilmById(Long id) {
		for (Film film : lstFilms) {
			if(film.getId()==id)
				return film;
		}
		return null;
	}

	@Override
	public List<Genre> getGenres() {
		// TODO Auto-generated method stub
		return lstGenres;
	}

	@Override
	public List<Participant> getParticipants() {
		// TODO Auto-generated method stub
		return lstParticipants;
	}

	@Override
	public Genre getGenreById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Participant getParticipantById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveFilm(Film film) {
		lstFilms.add(film);
	}

	@Override
	public void saveParticipant(@Valid Participant participant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveGenre(@Valid Genre genre) {
		// TODO Auto-generated method stub
		
	}

}
