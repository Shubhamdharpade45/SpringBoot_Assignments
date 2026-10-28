
package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Department;

@Repository
public class DepartmentDao {

    @Autowired
    SessionFactory factory;

    public String insertDepartment(Department d) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(d);

        tx.commit();
        session.close();

        return "Department inserted successfully";
    }

    public List<Department> getAllDepartments() {

        Session session = factory.openSession();

        Query<Department> query =
                session.createQuery("from Department", Department.class);

        List<Department> list = query.list();

        session.close();

        return list;
    }

    public Department getDepartmentById(int id) {

        Session session = factory.openSession();

        Department d = session.get(Department.class, id);

        session.close();

        return d;
    }

    public String updateDepartment(Department d) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.merge(d);

        tx.commit();
        session.close();

        return "Department updated successfully";
    }

    public String deleteDepartment(int id) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Department d = session.get(Department.class, id);

        session.remove(d);

        tx.commit();
        session.close();

        return "Department deleted successfully";
    }
}
