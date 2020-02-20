package com.abc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.abc.models.Product;

@Controller
public class ProductController {

	@RequestMapping(value="/product", method = RequestMethod.GET)
	public ModelAndView displayProduct() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("product");
		modelAndView.addObject("cus", "iphone");
		
		Product product = new Product();
		product.setProductId(12);
		product.setProductName("phone");
		
		modelAndView.addObject("product-info", product);
		
		return modelAndView;
		
		
	}
}
