
package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	public String insertStudent(Student s) {
		return dao.insertStudent(s);
	}

	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

	public Student getStudentById(int id) {
		return dao.getStudentById(id);
	}

	public String updateStudent(Student s) {
		return dao.updateStudent(s);
	}

	public String deleteStudent(int id) {
		return dao.deleteStudent(id);
	}
}
