package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.entity.Employee;
@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public String insertData(Employee e) {


		return dao.insertData(e);
	}
	
	public String deleteData(int id) {
	return	dao.deleteData(id);
		
	}

	public String updatedata(int id , Employee e) {
		
		return dao.updateData(id ,e);
	}

	public Employee getSingleData( int id) {
		return dao.getSingle(id);
	}
	
	public List<Employee> getAll() {
	return	dao.getAllRecord();
	}

}
