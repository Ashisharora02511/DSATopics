package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping
	public String getHtmlPage(Model model) {
		model.addAttribute("name", "ashish arora");
		model.addAttribute("date", new Date());
		
		return "about";
	}

	@GetMapping("/iterate")
	public String getHtmlPageitrerate(Model model) {
		List<String> of = List.of("Ashish","Rinku");
		
		model.addAttribute("names", of);
		return "iterate";
	}
	@GetMapping("/condition")
	public String conditionalStatement(Model model) {
	
		
		model.addAttribute("isActive", false);

		model.addAttribute("gender","F");
		List<Integer> list = List.of(123,3223,2323,3232,3434);
		model.addAttribute("mylist",list);
		return "condition";
	}
	@GetMapping("/services")
	public String servicesHandler(Model model) {
  model.addAttribute("title","i love to eat samosa");
  model.addAttribute("subtitle",LocalDateTime.now().toString());
		return "services";
	}
	@GetMapping("/about")
	public String inhertie(Model model) {

		return "aboutnew";
	}
	@GetMapping("/example")
	public String example(Model model) {

		return "example";
	}
}
