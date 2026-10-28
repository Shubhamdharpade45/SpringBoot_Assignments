
package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DepartmentDao;
import com.example.entity.Department;

@Service
public class DepartmentService {

    @Autowired
    DepartmentDao dao;

    public String insertDepartment(Department d) {
        return dao.insertDepartment(d);
    }

    public List<Department> getAllDepartments() {
        return dao.getAllDepartments();
    }

    public Department getDepartmentById(int id) {
        return dao.getDepartmentById(id);
    }

    public String updateDepartment(Department d) {
        return dao.updateDepartment(d);
    }

    public String deleteDepartment(int id) {
        return dao.deleteDepartment(id);
    }
}
