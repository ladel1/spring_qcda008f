package bzh.eni.ecole.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bzh.eni.ecole.bo.Genre;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
