package com.abc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.models.Customer;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView helloDisplay() {
		
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("hello");
		modelAndView.addObject("location", "fairafx");
		
		Customer customer = new Customer();
		customer.setEmail("abc@gmail.com");
		customer.setName("Aman");
		modelAndView.addObject("customer-info", customer);
		return modelAndView;

	}

}