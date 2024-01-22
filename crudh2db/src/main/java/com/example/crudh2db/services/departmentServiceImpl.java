package com.example.crudh2db.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudh2db.enitity.Department;
import com.example.crudh2db.repository.departmentRepository;

@Service
public class departmentServiceImpl implements departmentService {
    @Autowired
    private departmentRepository departmentrepository;

    @Override
    public Department createDepartment(Department department) {
        return departmentrepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentrepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentrepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentrepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {
        Department dept = departmentrepository.findById(departmentId).get();

        if (department.getDepartmentName() != null) {
            dept.setDepartmentName(department.getDepartmentName());
        }

        if (department.getDepartmentAddress() != null) {
            dept.setDepartmentAddress(department.getDepartmentAddress());
        }

        if (department.getDepartmentCode() != null) {
            dept.setDepartmentCode(department.getDepartmentCode());
        }

        return departmentrepository.save(dept);
    }

}
