package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class HomeController {


	/*	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String hello() {
		return "Home";
	}
	 */	
	@ResponseBody
	@RequestMapping(value= {"/home","/home1","home2"}, method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView home(ModelAndView mv) {
		mv.addObject("msg","iCompass Is Coming, Work Hard!!!");
		mv.setViewName("Home");
		return mv;
	}

}


