package bzh.eni.ecole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import bzh.eni.ecole.entity.Utilisateur;
import bzh.eni.ecole.service.UtilisateurService;
import jakarta.validation.Valid;

@Controller
public class RegisterController {
	
	@Autowired
	private UtilisateurService utilisateurService;
	// pour chiffrer le mot de passe 
	@Autowired
	private PasswordEncoder passwordEncoder;
	/**
	 * pour afficher le formulaire d'inscription
	 * @param model
	 * @return
	 */
	@GetMapping("/inscription")
	public String index(Model model) {
		model.addAttribute("utilisateur",new Utilisateur());
		model.addAttribute("roles",utilisateurService.allRoles());
		return "security/register";
	}
	/**
	 * Valider le formulaire d'inscription et ajouter dans bdd
	 * @param utilisateur
	 * @param br
	 * @return
	 */
	@PostMapping("/inscription")
	public String register(
			@Valid @ModelAttribute Utilisateur utilisateur,
			BindingResult br
			) {
		
		if(br.hasErrors()) {			
			return "security/register";
		}
		// encrypt mot de passe
		utilisateur.setPassword( passwordEncoder.encode( 
					utilisateur.getPassword()
				) );
		// sauvegarde
		utilisateurService.saveUtilisateur(utilisateur);
		
		return "redirect:/login";
	}
	
	
	
}
