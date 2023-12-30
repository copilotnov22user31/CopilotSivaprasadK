package com.example.demo.models;

import lombok.Data;

@Data
public class Employee 
{
    public Employee(int i, String string, String string2, int j) {
        this.id=i;
        this.name=string;
        this.city=string2;
        this.salary=j;
    }
    //id name city salary
    private int id;
    private String name;
    private String city;
    private int salary;


}
