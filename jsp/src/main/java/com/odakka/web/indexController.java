package com.odakka.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
	
	@Autowired
	private BoardService boardservice;
	
	

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/board")
	public ModelAndView board() {
		ModelAndView mv = new ModelAndView("board");
		int toSize = boardservice.toSize();
		mv.addObject("toSize", toSize);
		return mv;
	}
}
