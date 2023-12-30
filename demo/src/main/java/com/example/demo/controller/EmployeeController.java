package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.repo.EmployeeRepo;

@RestController
public class EmployeeController {
     
    @Autowired
    EmployeeRepo empRepo;

     
    
        @GetMapping("/employee")
        public List<Employee> employee()
        {
            Collection<Employee> employees=empRepo.addEmployee().values();
            return new ArrayList<>(employees);
        }

}
