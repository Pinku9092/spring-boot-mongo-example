package com.pinku.service;

import com.pinku.repository.EmployeeRepository;
import com.pinku.dto.EmployeeDTO;
import com.pinku.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee(EmployeeDTO employeeDTO) {
        try {
            // Convert EmployeeDTO to Employee

           Employee emp = new Employee();
           emp.setEmpName(employeeDTO.getEmpName());
           emp.setLocation(employeeDTO.getLocation());
           emp.setSalary(employeeDTO.getSalary());


            // Save Employee to MongoDB
            employeeRepository.save(emp);

        } catch (Exception e) {
            return "Error creating employee";
        }
        return "Employee created successfully";
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        try{
            employees = employeeRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error fetching employees");
        }
        return employees;
    }
}
