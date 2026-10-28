
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

import com.example.entity.Department;
import com.example.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService service;

	@PostMapping("/insert")
	public String insertDepartment(@RequestBody Department d) {
		return service.insertDepartment(d);
	}

	@GetMapping("/all")
	public List<Department> getAllDepartments() {
		return service.getAllDepartments();
	}

	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable int id) {
		return service.getDepartmentById(id);
	}

	@PutMapping("/update")
	public String updateDepartment(@RequestBody Department d) {
		return service.updateDepartment(d);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteDepartment(@PathVariable int id) {
		return service.deleteDepartment(id);
	}
}
