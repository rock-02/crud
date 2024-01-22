package com.example.crudh2db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudh2db.enitity.Department;

@Repository
public interface departmentRepository extends JpaRepository<Department, Long> {
  
}
