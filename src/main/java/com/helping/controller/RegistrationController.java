package com.helping.controller;


import com.helping.model.Employee;
import com.helping.repository.EmployeeRepository;
import com.helping.service.EmployeeRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/helping")
public class RegistrationController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeRegistrationService employeeRegistrationService;

    @PostMapping("/registerEmployee")
    public Employee registerPatient(@RequestBody @Valid Employee employee) {
        return employeeRegistrationService.registerEmployee(employee);
    }
}
