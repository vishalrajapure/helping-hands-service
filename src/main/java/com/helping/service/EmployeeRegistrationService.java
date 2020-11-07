package com.helping.service;

import com.helping.model.Employee;
import org.springframework.http.ResponseEntity;

public interface EmployeeRegistrationService {
    Employee registerEmployee(Employee patient);

}
