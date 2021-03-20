package com.helping.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helping")
public class RegistrationController {

   /* @Autowired
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
    }*/

    @GetMapping("/testHealth")
    public String testHealth(){
        return "Helping hand is accessible!!";
    }
}
