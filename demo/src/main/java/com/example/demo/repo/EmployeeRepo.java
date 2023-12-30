package com.example.demo.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.models.Employee;

@Repository
public class EmployeeRepo
{

    public HashMap<Integer,Employee> empMap=new HashMap<Integer,Employee>();
    

    public HashMap<Integer,Employee> addEmployee()
    {
        

        empMap.put(1,new Employee(1,"Ravi","Pune",10000));
        empMap.put(2,new Employee(2,"Raju","Mumbai",20000));
        empMap.put(3,new Employee(3,"Rahul","Delhi",30000));
        empMap.put(4,new Employee(4,"Ramesh","Chennai",40000));
        
        
        return empMap;
    }

    //add list for employee
    //add method to add employee
    //add method to get all employee
    //add method to get employee by id
    //add method to update employee by id
    //add method to delete employee by id
    
    
}
