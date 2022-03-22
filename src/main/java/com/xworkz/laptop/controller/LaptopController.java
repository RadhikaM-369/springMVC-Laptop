package com.xworkz.laptop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class LaptopController {
	public LaptopController() {
		System.out.println("Laptop Bean created");
	}
		
	@RequestMapping("addInfo")
	public String addClick(@RequestParam String laptopBrand,@RequestParam String laptopName,
			@RequestParam int laptopRAM, @RequestParam double laptopPrice) {
		System.out.println("Invoked addClick()");
		System.out.println("Brand : "+laptopBrand);
		System.out.println("Name : "+laptopName);
		System.out.println("RAM : "+laptopRAM);
		System.out.println("Price: "+laptopPrice);
		return "/WEB-INF/Info.html";
	}
	
}

