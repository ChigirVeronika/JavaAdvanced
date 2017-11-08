package com.veronika.advanced.java8.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeDemo {

    public static void main(String[] args) {
        //sorting object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);

//sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(empArr));



        Comparator<Employee> comparator = Comparator
                .comparingLong(Employee::getSalary)
                .thenComparing(Employee::getAge);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Mikey", 25, 10000));
        employees.add(new Employee(20, "Arun", 29, 20000));
        employees.add(new Employee(5, "Lisa", 35, 5000));
        employees.add(new Employee(1, "Pankaj", 32, 50000));
        employees.sort(comparator);
        System.out.println(employees);
    }


}
