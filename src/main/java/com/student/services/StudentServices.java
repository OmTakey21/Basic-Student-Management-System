package com.student.services;

import java.util.List;

import com.student.entities.Student;

public interface StudentServices {

		String addStudent(Student st);

		String updateStudent(Student st);

		String deleteStudent(int univId);

		Student searchStudent(int univId);

		List<Student> findAllStudents();
}
