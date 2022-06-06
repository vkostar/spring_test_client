package com.kostar.spring.rest;

import com.kostar.spring.rest.configuration.Myconfig;
import com.kostar.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
        Communication communication = context.getBean("communication", Communication.class);


//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(9);
//        System.out.println(empById);

//
//        Employee emp = new Employee("Kost", "Vikh", "ItT", 3000);
//        emp.setId(11);
//        communication.saveEmployee(emp);

        communication.deleteEmployee(11);


    }
}
