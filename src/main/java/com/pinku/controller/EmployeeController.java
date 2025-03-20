package com.pinku.controller;

import com.pinku.dto.EmployeeDTO;
import com.pinku.model.Employee;
import com.pinku.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }

    @GetMapping("/get/employee")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
