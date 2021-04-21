package com.practice.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("this is about handler");
		model.addAttribute("name", "ankur pandey");
		model.addAttribute("currentDate", new Date());
		return "about";
//		about.html
	}

	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		List<String> names = List.of("ankur", "ankit", "mayur", "sumit");
		model.addAttribute("names", names);
		return "iterate";
	}

	@GetMapping("/condition")
	public String conditionHandler(Model model) {
		System.out.println("condition handler executed");
		model.addAttribute("isActive", true);
		model.addAttribute("gender", 'F');

		List<Integer> list = List.of(10, 11, 12, 13, 45, 675, 3, 1);
		model.addAttribute("myList", list);

		return "condition";
	}

//	handler for including fragment
	@GetMapping("/services")
	public String serviceHandler(Model model) {
		model.addAttribute("title", "today's date is ");
		model.addAttribute("date", LocalDate.now().toString());
		return "service";
	}
}
