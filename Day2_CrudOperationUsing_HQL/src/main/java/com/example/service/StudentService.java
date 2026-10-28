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

	public String insertData(Student s) {
		return dao.insertData(s);
	}

	public String updateData(int id, Student s) {
		return dao.updateData(id, s);
	}

	public String deleteData(int id) {
		return dao.deleteData(id);
	}

	public Student getSingleData(int id) {
		return dao.getSingleData(id);
	}

	public List<Student> getAllData() {
		
		return dao.getAllData();
	}
}