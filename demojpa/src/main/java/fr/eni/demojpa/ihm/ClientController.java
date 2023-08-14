package fr.eni.demojpa.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.demojpa.bo.Client;

@Controller
public class ClientController {

	@GetMapping({"/"})
	public String displayAddClient(Model model) {
		model.addAttribute("client",new Client());
		return "client/add";
	}
	
	@PostMapping({"/client/ajouter"})
	public String addClient() {
		return "";
		}
	public String detailsClient() {
		return "";
	}
	public String listClients() {
		return "";
	}
	
	
}
