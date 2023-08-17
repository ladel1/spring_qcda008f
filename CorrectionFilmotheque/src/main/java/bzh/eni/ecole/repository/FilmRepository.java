package bzh.eni.ecole.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bzh.eni.ecole.bo.Film;

// DAO
public interface FilmRepository extends JpaRepository<Film, Long> {
}
