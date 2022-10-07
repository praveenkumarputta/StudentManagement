package com.ssc.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssc.dao.StudentRepository;
import com.ssc.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudentDetails() {
		return studentRepository.findAll();
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll().stream().sorted(Comparator.comparing(Student::getStudentFee))
				.collect(Collectors.toList());
	}

	public List<Student> SaveStudentDetails(List<Student> students) {
		return studentRepository.saveAll(students);
	}
}
