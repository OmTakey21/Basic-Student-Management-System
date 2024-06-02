package com.student.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.entities.Student;
import com.student.services.StudentServices;

@Controller
public class StudentController {
	@Autowired
	StudentServices service;
	@PostMapping("/reg")
		public String addStudent(Student st) {
			service.addStudent(st);
			return "index";
		}
	
	@PostMapping("/upd")
		public String updateStudent(Student st) {
			service.updateStudent(st);
			return "index";
		}
	
	@PostMapping("/del")
	public String deleteStudent(int univId) {
		service.deleteStudent(univId);
		return "index";
	}
	
	@PostMapping("/search")
	public String searchStudent(int univId, Model m) {
		Student s=service.searchStudent(univId);
		m.addAttribute("Student", s);
		return "displayStudent";
	}
	
	@GetMapping("/findAll")
	public String findAllStudents(Model m) {
		List<Student> slist=service.findAllStudents();
		m.addAttribute("stlist", slist);
		return "viewStudent";
	}
}
