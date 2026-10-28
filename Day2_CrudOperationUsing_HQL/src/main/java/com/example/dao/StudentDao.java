package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory sf;

	public String insertData(Student s) {

		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String sql = "insert into student_info " + "(f_name, l_name, city, age, department, email, "
				+ "phone, gender, course, college_name, state, " + "status, admission_date, fees) "
				+ "values (:fName, :lName, :city, :age, :department, "
				+ ":email, :phone, :gender, :course, :collegeName, " + ":state, :status, :admissionDate, :fees)";

		MutationQuery query = ss.createNativeMutationQuery(sql);

		query.setParameter("fName", s.getFName());
		query.setParameter("lName", s.getLName());
		query.setParameter("city", s.getCity());
		query.setParameter("age", s.getAge());
		query.setParameter("department", s.getDepartment());
		query.setParameter("email", s.getEmail());
		query.setParameter("phone", s.getPhone());
		query.setParameter("gender", s.getGender());
		query.setParameter("course", s.getCourse());
		query.setParameter("collegeName", s.getCollegeName());
		query.setParameter("state", s.getState());
		query.setParameter("status", s.getStatus());
		query.setParameter("admissionDate", s.getAdmissionDate());
		query.setParameter("fees", s.getFees());

		query.executeUpdate();
		tr.commit();
		ss.close();

		return "Student Inserted Successfully";

	}

	public String updateData(int id, Student s) {

		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "update Student set fName=:fName, lName=:lName, city=:city, age=:age, department=:department, email=:email, "
				+ "phone=:phone, gender=:gender, course=:course, collegeName=:collegeName, state=:state, status=:status, admissionDate=:admissionDate, fees=:fees where id=:id";

		MutationQuery query = ss.createMutationQuery(hql);

		query.setParameter("fName", s.getFName());
		query.setParameter("lName", s.getLName());
		query.setParameter("city", s.getCity());
		query.setParameter("age", s.getAge());
		query.setParameter("department", s.getDepartment());
		query.setParameter("email", s.getEmail());
		query.setParameter("phone", s.getPhone());
		query.setParameter("gender", s.getGender());
		query.setParameter("course", s.getCourse());
		query.setParameter("collegeName", s.getCollegeName());
		query.setParameter("state", s.getState());
		query.setParameter("status", s.getStatus());
		query.setParameter("admissionDate", s.getAdmissionDate());
		query.setParameter("fees", s.getFees());
		query.setParameter("id", id);

		int count = query.executeUpdate();

		tr.commit();
		ss.close();

		if (count > 0) {
			return "Updated Successfully";
		}

		return "Student Not Found";
	}

	public String deleteData(int id) {
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hql = "delete from Student where id = :id";
		MutationQuery query = ss.createMutationQuery(hql);
		query.setParameter("id", id);

		int count = query.executeUpdate();
		tr.commit();
		ss.close();

		if (count > 0) {
			return "Student Deleted Successfully";
		}
		return "Student Not Found";
	}

	public Student getSingleData(int id) {
		Session ss = sf.openSession();

		String hql = "from Student where id = :id";
		Query<Student> query = ss.createQuery(hql, Student.class);
		query.setParameter("id", id);

		Student s = query.uniqueResult();
		ss.close();

		System.out.println(s);
		return s;
	}

	public List<Student> getAllData() {

	    Session ss = sf.openSession();

	    String hql = "from Student";

	    Query<Student> query = ss.createQuery(hql, Student.class);

	    List<Student> list = query.getResultList();

	    ss.close();

	    return list;
	}
	

}