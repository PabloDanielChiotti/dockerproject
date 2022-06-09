package com.rest.dockerproject.repository;

import com.rest.dockerproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    Employee save(Employee employee);
    
    List<Employee> findAll();
}
