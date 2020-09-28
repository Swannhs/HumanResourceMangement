package com.example.demo.employee.service;

import com.example.demo.employee.entity.Employee;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface EmployeeServiceInterface extends UserDetailsService {
    Employee save(Employee employee);
    Iterable<Employee> findAllEmployees();
}
