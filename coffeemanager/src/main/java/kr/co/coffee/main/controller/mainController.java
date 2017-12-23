package kr.co.coffee.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mainController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String mainPage(Model model) {
				
		model.addAttribute("content", "main/chart.jsp");
		return "main";
	}
	
}