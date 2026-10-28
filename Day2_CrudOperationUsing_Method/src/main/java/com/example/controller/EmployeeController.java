package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.EmployeeService;
import com.example.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/insert")
	public String insertData(@RequestBody Employee e) {

		return service.insertData(e);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteDat(@PathVariable int id) {

		return service.deleteData(id);

	}

	@PutMapping("/update/{id}")
	public String updateData(@PathVariable int id, @RequestBody Employee e) {
		return service.updatedata(id, e);
	}

	@GetMapping("/getsingle/{id}")
	public Employee getSingle(@PathVariable int id) {
		return service.getSingleData(id);
	}

	@GetMapping("/getall")
	public List<Employee> getAll() {

		return service.getAll();

	}

}
