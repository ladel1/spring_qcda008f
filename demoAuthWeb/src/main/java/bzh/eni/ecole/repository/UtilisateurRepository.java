package bzh.eni.ecole.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bzh.eni.ecole.entity.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	Utilisateur findByUsername(String username);
}
