package com.helping.service;

import com.helping.exception.ResourceAlreadyExistException;
import com.helping.model.Admin;
import com.helping.model.Employee;
import com.helping.repository.AdminRepository;
import com.helping.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeRegistrationServiceImpl implements EmployeeRegistrationService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AdminRepository adminRepository;


    @Override
    public Employee registerEmployee(Employee employee) throws ResourceAlreadyExistException {
        if (!employeeRepository.existsById(employee.getMobileNumber())) {
            return employeeRepository.save(employee);
        } else
            throw new ResourceAlreadyExistException("Employee", "Mobile number", employee.getMobileNumber());
    }

    @Override
    public Admin registerAdmin(Admin admin) {
        if (!adminRepository.existsById(admin.getMobileNumber())) {
            return adminRepository.save(admin);
        } else
            throw new ResourceAlreadyExistException("Admin", "Mobile number", admin.getMobileNumber());
    }
}
