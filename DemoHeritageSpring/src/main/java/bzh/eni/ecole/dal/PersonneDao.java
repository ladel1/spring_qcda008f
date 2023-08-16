package bzh.eni.ecole.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bzh.eni.ecole.bo.Personne;

public interface PersonneDao extends JpaRepository<Personne, Integer>, PersonneDaoCustom {

	List<Personne> findByNomIgnoreCase(String nom);
	
	@Query("SELECT p FROM Personne p WHERE p.adresse = ?1")
	List<Personne> findCostum(String adresse);
	List<Personne> trouverTous();
}
