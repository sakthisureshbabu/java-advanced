package com.example.main;

// when two packages have classes with same name they cannot be imported one into another
// So they can be imported to other class one by import statement and other inside codeblock
import com.example.service.Employee;
//import com.example.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee_1 = new Employee(10, "Sakthi");
        employee_1.details();

        // Employee employee_2 = new Employee();
        // employee_2.details();
        
        // second package class is used with fully qualified name
        com.example.model.Employee employee_2 = new com.example.model.Employee();
        employee_2.details();
    }
}
