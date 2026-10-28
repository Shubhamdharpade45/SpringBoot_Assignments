package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/insert")
	public String insertData(@RequestBody Student s) {
		return service.insertData(s);
	}

	@PutMapping("/update/{id}")
	public String updateData(@PathVariable int id, @RequestBody Student s) {

		return service.updateData(id, s);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		return service.deleteData(id);
	}
	
	@GetMapping("/getSingle/{id}")
	public Student getSingleData(@PathVariable int id) {
	    return service.getSingleData(id);
	}
	
	@GetMapping("/getall")
	public List<Student> getAllData() {
	    return service.getAllData();
	}
}