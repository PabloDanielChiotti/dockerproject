package com.rest.dockerproject.controller;

import com.rest.dockerproject.dto.EmployeeDto;
import com.rest.dockerproject.request.CreateEmployeeRequestBody;
import com.rest.dockerproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmployeeController extends BaseController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public void saveEmployee(@Valid @RequestBody CreateEmployeeRequestBody request) {
        //TODO ver de meter un mapeo aquí
        EmployeeDto employee = EmployeeDto.builder().name(request.getName()).build();
        employeeService.saveEmployee(employee);
    }

    @GetMapping("/employeeList")
    public void getEmployeeList() {
        employeeService.findEmployeeList();
    }

}
