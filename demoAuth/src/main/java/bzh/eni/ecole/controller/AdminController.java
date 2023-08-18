package bzh.eni.ecole.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

	@GetMapping("/admin")
	public @ResponseBody String home() {
		return "Je suis Admin 🤣";
	}

	
}
