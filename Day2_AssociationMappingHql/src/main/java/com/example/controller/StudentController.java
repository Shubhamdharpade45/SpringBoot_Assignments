
package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/insert")
	public String insertStudent(@RequestBody Student s) {
		return service.insertStudent(s);
	}

	@GetMapping("/all")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}

	@PutMapping("/update")
	public String updateStudent(@RequestBody Student s) {
		return service.updateStudent(s);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
}
