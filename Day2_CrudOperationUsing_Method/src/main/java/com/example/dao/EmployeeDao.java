package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

import jakarta.persistence.Query;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory sf;

	public String insertData(Employee e) {

		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(e);

		tr.commit();
		ss.close();

		return "Inserted...";
	}

	public String deleteData(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = ss.find(Employee.class, id);

		ss.remove(e);

		return "Deleted";

	}

	public String updateData(int id, Employee e) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee emp = ss.find(Employee.class, id);

		emp.setAge(e.getAge());
		emp.setCity(e.getCity());
		emp.setDepartment(e.getDepartment());
		emp.setDesignation(e.getDesignation());
		emp.setEmail(e.getEmail());
		emp.setEmploeeType(e.getEmploeeType());
		emp.setfName(e.getfName());
		emp.setlName(e.getlName());
		emp.setGender(e.getGender());
		emp.setPhone(e.getPhone());
		emp.setSalary(e.getSalary());
		emp.setState(e.getState());
		emp.setStatus(e.getStatus());
		emp.setJoiningDate(e.getJoiningDate());

		ss.merge(emp);

		tr.commit();

		System.out.println("After: " + emp);
		ss.close();

		return "Updated";
	}

	public Employee getSingle(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee emp = ss.find(Employee.class, id);

		return emp;
	}

	public List<Employee> getAllRecord() {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Employee";

		Query query = ss.createQuery(hqlQuery, Employee.class);
		List<Employee> list = query.getResultList();

	
		tr.commit();
		ss.close();

		return list;

	}

}
