package bzh.eni.ecole.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bzh.eni.ecole.bo.Film;
import bzh.eni.ecole.bo.Genre;
import bzh.eni.ecole.bo.Participant;
import bzh.eni.ecole.repository.FilmRepository;
import bzh.eni.ecole.repository.GenreRepository;
import bzh.eni.ecole.repository.ParticipantRepository;

@Service("JPA")
public class FilmServiceImpl implements FilmService {

	@Autowired private FilmRepository filmRepository;
	@Autowired private GenreRepository genreRepository;
	@Autowired private ParticipantRepository participantRepository;
	
	@Override
	public List<Film> getAllFilms() {		
		return filmRepository.findAll();
	}

	@Override
	public Film getFilmById(Long id) {
		return filmRepository.findById(id).get();
	}

	@Override
	public List<Genre> getGenres() {
		return genreRepository.findAll();
	}

	@Override
	public List<Participant> getParticipants() {
		return participantRepository.findAll();
	}

	@Override
	public Genre getGenreById(Long id) {
		return genreRepository.findById(id).get();
	}

	@Override
	public Participant getParticipantById(Long id) {		
		return participantRepository.findById(id).get();
	}

	@Override
	public void saveFilm(Film film) {
		System.out.println("JPA Save Film");
		filmRepository.save(film);		
	}

}
