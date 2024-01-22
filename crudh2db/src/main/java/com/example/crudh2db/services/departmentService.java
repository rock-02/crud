package com.example.crudh2db.services;

import java.util.List;

import com.example.crudh2db.enitity.Department;

public interface departmentService {

    Department createDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartmentById(Long departmentId, Department department);

}
