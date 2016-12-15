package com.github.carter659.spring02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "刘冬");
		return "index";
	}

}
