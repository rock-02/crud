package com.example.crudh2db.coontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudh2db.enitity.Department;
import com.example.crudh2db.services.departmentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class departmentController {

    @Autowired
    private departmentService departmentservice;

    @PostMapping("/department")
    public Department createDepartment(@RequestBody Department department) {

        return departmentservice.createDepartment(department);

    }

    @GetMapping("/department")
    public List<Department> getAllDepartments() {
        return departmentservice.getAllDepartments();
    }


    
    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentservice.getDepartmentById(departmentId);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentservice.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }

    @PutMapping("/department/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId,@RequestBody Department department) {
        return departmentservice.updateDepartmentById(departmentId,department);
    }

}
