package com.ssc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssc.model.Student;
import com.ssc.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/getAll")
	public List<Student> getAllStudentDetais() {
		return studentService.getAllStudentDetails();
	}

	@GetMapping("/getAllStudetnts")
	public List<Student> getAllSutdetnsInformation() {
		return studentService.getAllStudent();
	}

	@PostMapping("/addStudents")
	public List<Student> saveAllStudentDetails(@RequestBody List<Student> student) {
		return studentService.SaveStudentDetails(student);
	}
}
