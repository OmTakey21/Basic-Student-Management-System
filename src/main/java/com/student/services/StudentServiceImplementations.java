package com.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.Student;
import com.student.repository.StudentRepo;

@Service
public class StudentServiceImplementations implements StudentServices{
	@Autowired	
	StudentRepo rep;

		@Override
		public String addStudent(Student st) {
			rep.save(st);
			return ("Student Added Successfully!");
			
		}

		@Override
		public String updateStudent(Student st) {
			rep.save(st);
			return("Student Updated Successfully!");
			
		}

		@Override
		public String deleteStudent(int univId) {
			rep.deleteById( univId);
			return "Student deleted Successfully!";
		}

		@Override
		public Student searchStudent(int univId) {
			
			return rep.findById(univId).get();
		}

		@Override
		public List<Student> findAllStudents() {
			
			return rep.findAll();
		}

	
}
