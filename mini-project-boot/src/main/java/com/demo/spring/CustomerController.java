package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.spring.entity.Customers;

@Controller
public class CustomerController {
		
	@Autowired
	CustomerRepository cr;
	
	@RequestMapping(path="/request",method=RequestMethod.GET)
	public String getFirstPage(Model model) {
		Customers c = new Customers();
		model.addAttribute("customers",c);
		return "customers";
	}
	
	@RequestMapping(path = "/register",method = RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("customers")Customers c) {
		ModelAndView mv = new ModelAndView();
		cr.save(c);
		mv.setViewName("response");
		String user = c.getFname() + c.getLname();
		mv.addObject("name",user);
		return mv;
	}
}
