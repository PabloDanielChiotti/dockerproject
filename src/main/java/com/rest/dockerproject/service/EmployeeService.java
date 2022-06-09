package com.rest.dockerproject.service;

import com.rest.dockerproject.dto.EmployeeDto;

public interface EmployeeService {

    void saveEmployee(EmployeeDto employee);

    void findEmployeeList();
}
