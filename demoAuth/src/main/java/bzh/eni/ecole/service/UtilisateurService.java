package bzh.eni.ecole.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import bzh.eni.ecole.bo.Utilisateur;

@Service
public class UtilisateurService implements UserDetailsService {
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("************************");
		Utilisateur adel = new Utilisateur(1, "adel", 
				passwordEncoder.encode("123456"), 
				"adel@gmail.com", List.of("ROLE_ADMIN"));
		return adel;
	}

}








