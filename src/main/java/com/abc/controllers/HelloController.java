package com.abc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="hello", method = RequestMethod.GET)
	public String helloDisplay() {
		System.out.println("Print hello from method helloDisplay");
		return "hello-page";
	}
	
}