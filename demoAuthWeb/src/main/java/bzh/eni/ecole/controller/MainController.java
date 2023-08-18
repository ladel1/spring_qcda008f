package bzh.eni.ecole.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/")
	public @ResponseBody String index() {
		return "Bonjour tout le 🌍";
	}
	
	@GetMapping("/mon-compte")
	public @ResponseBody String monCompte() {
		return "Page privé <a href='/logout'>logout</a>";
	}

}
