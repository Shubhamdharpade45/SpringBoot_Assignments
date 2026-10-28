
package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Department;
import com.example.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;

	public String insertStudent(Student s) {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Department d = session.get(Department.class, s.getDepartment().getDeptId());

		s.setDepartment(d);
		session.persist(s);

		tx.commit();
		session.close();

		return "Student inserted successfully";
	}

	public List<Student> getAllStudents() {

		Session session = factory.openSession();

		Query<Student> query = session.createQuery("from Student", Student.class);

		List<Student> list = query.list();

		session.close();

		return list;
	}

	public Student getStudentById(int id) {

		Session session = factory.openSession();

		Student s = session.get(Student.class, id);

		session.close();

		return s;
	}

	public String updateStudent(Student s) {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Department d = session.get(Department.class, s.getDepartment().getDeptId());

		s.setDepartment(d);
		session.merge(s);

		tx.commit();
		session.close();

		return "Student updated successfully";
	}

	public String deleteStudent(int id) {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student s = session.get(Student.class, id);

		session.remove(s);

		tx.commit();
		session.close();

		return "Student deleted successfully";
	}
}
