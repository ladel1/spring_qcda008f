package bzh.eni.ecole.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bzh.eni.ecole.bo.Personne;

public interface PersonneDao extends JpaRepository<Personne, Integer> {

	List<Personne> findByNomIgnoreCase(String nom);
	
}
