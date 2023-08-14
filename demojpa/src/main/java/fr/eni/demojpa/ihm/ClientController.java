package fr.eni.demojpa.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.demojpa.bll.ClientService;
import fr.eni.demojpa.bo.Client;
import jakarta.validation.Valid;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping({"/","/clients/ajouter"})
	public String displayAddClient(Model model) {
		model.addAttribute("client",new Client());
		return "client/add";
	}
	
	@PostMapping({"/clients/ajouter"})
	public String addClient( 
			@Valid @ModelAttribute Client client, 
			BindingResult br 
			) {
		
			if(br.hasErrors()) return "client/add";
			
			clientService.addClient(client);
			return "redirect:/";
		}
	
	
	@GetMapping("/clients/details/{id:[0-9]+}")
	public String detailsClient(@PathVariable Integer id, Model model) {
		model.addAttribute("client", clientService.findOne(id));
		return "client/details";
	}
	
	@GetMapping({"/clients"})
	public String listClients(Model model ) {
		model.addAttribute("clients",clientService.findAll());
		return "client/index";
	}
	
	
}
