package com.xworkz.laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.service.LaptopService;

@Controller
@RequestMapping("/")
public class LaptopController {
	@Autowired
	private LaptopService laptopService;

	public LaptopController() {
		System.out.println("Laptop Bean created");
	}

	@RequestMapping("addInfo")
	public String addClick(@ModelAttribute LaptopDto dto) {
		System.out.println("Invoked addClick()");
		boolean result = laptopService.validateLaptopDTO(dto);
		if (result) {
			laptopService.saveLaptopDTO(dto);
		}
		System.out.println(dto);

		return "/WEB-INF/Info.html";
	}

	@RequestMapping("Info")
	public String info() {
		System.out.println("Invoked addClick()");

		return "/WEB-INF/Info.html";
	}

}
