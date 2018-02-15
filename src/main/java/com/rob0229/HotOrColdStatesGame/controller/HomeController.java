package com.rob0229.HotOrColdStatesGame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index(Model model) {
		//model.addAttribute("someDiv", "<div>20</div>");
		return "index";
	}

}
