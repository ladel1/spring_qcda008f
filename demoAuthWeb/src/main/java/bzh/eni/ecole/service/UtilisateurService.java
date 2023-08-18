package bzh.eni.ecole.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import bzh.eni.ecole.entity.Role;
import bzh.eni.ecole.entity.Utilisateur;
import bzh.eni.ecole.repository.RoleRepository;
import bzh.eni.ecole.repository.UtilisateurRepository;

@Service
// implementer l'interface UserDetailsService pour fournir les utilisateurs
public class UtilisateurService implements UserDetailsService {

	@Autowired
	private UtilisateurRepository uRepo;
	@Autowired
	private RoleRepository rRepo;
	
	/**
	 * Une méthode redifinit pour cherche un utilisateur par son username
	 * cette méthode est appelée chaque connexion (username,password)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
		return uRepo.findByUsername(username);
	}
	/**
	 * afficher tous les roles
	 * @return
	 */
	public List<Role> allRoles(){
		return rRepo.findAll();
	}
	/**
	 * ajouter inscrire un utilisateur
	 * @param utilisateur
	 */
	public void saveUtilisateur(Utilisateur utilisateur ) {
		uRepo.save(utilisateur);
	}

}
