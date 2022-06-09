package com.rest.dockerproject.service.impl;

import com.rest.dockerproject.dto.EmployeeDto;
import com.rest.dockerproject.model.Employee;
import com.rest.dockerproject.repository.EmployeeRepository;
import com.rest.dockerproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    @Autowired
    private EmployeeRepository repository;
    
    public void saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setName(employeeDto.getName());
        repository.save(employee);
    }

    @Override
    public void findEmployeeList() {
        List<Employee> employeeList = repository.findAll();
        for (Employee employee : employeeList) {
            System.out.println("Employee ID: "+employee.getId()+" and the name is: "+employee.getName());
        }
    }
}
