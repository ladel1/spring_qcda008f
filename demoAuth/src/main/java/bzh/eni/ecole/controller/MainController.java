package bzh.eni.ecole.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/")
	public @ResponseBody String home() {
		return "Hello world!";
	}
	
	@GetMapping("/blog")
	public @ResponseBody String blog() {
		return "Blog";
	}
	
	@GetMapping("/prive")
	public @ResponseBody String prive() {
		return "Prive";
	}	
	
}
