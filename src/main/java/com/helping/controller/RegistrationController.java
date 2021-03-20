package com.helping.controller;


import com.helping.model.Admin;
import com.helping.model.Employee;
import com.helping.repository.EmployeeRepository;
import com.helping.service.EmployeeRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/registerAdmin")
    public Admin registerAdmin(@RequestBody @Valid Admin admin) {
        return employeeRegistrationService.registerAdmin(admin);
    }

    @GetMapping("/testHealth")
    public String testHealth(){
        return "Helping hand is accessible!!";
    }
}
