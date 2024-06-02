package com.student.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
		
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("currentpage", "index");
		return "index";
	}
	@GetMapping("/registerPage")
	public String register(Model model) {
		model.addAttribute("currentpage", "addStudent");
		return "addStudent";
	}
	@GetMapping("/searchPage")
	public String search(Model model) {
		model.addAttribute("currentpage", "searchStudent");
		return "searchStudent";
	}
	@GetMapping("/updatePage")
	public String update(Model model) {
		model.addAttribute("currentpage", "updateStudent");
		return "updateStudent";
	}
	@GetMapping("/deletePage")
	public String delete(Model model) {
		model.addAttribute("currentpage", "removeStudent");
		return "removeStudent";
	}
}
