package nellooove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping
	public String home () {
		
		return "index";
	}
	
	@GetMapping("/lightning")
	public String lightning () {
		
		return "lightning";
	}
	
	@GetMapping("/rainlightning")
	public String rainLightning () {
		
		return "rainlightning";
	}
}
