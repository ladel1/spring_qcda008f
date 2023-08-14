package fr.eni.demojpa.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.demojpa.bll.ClientService;
import fr.eni.demojpa.bo.Client;
import jakarta.validation.Valid;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping({"/"})
	public String displayAddClient(Model model) {
		model.addAttribute("client",new Client());
		return "client/add";
	}
	
	@PostMapping({"/client/ajouter"})
	public String addClient( 
			@Valid @ModelAttribute Client client, 
			BindingResult br 
			) {
		
			if(br.hasErrors()) return "client/add";
			
			clientService.addClient(client);
			return "redirect:/";
		}
	
	
	
	public String detailsClient() {
		return "";
	}
	public String listClients() {
		return "";
	}
	
	
}
