package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.spring.entity.Supp_Requests;

@Controller
public class SuppController {
	
	@Autowired
	SuppRepository sr;
	
	@RequestMapping(path="/register",method=RequestMethod.GET)
	public String getFirstPage(Model model) {
		Supp_Requests s = new Supp_Requests();
		model.addAttribute("Supp_Requests",s);
		return "Supp_Requests";
	}
	
	@RequestMapping(path = "/register",method = RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("Supp_Requests")Supp_Requests s) {
		ModelAndView mv = new ModelAndView();
		if(sr.existsById(s.getRequestId())) {
			mv.setViewName("response");
			mv.addObject("name","");   // set the username
		}
		else {
			sr.save(s);
			mv.setViewName("registerForm");
		}
		return mv;
	}
}
