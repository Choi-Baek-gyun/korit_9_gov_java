package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private double salary;
    // constructor, getters

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public EmployeeDTO toDto() {
        return new EmployeeDTO(String.format("Mr./Ms. %s", name), String.format("$%f", salary));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeDTO {
    private String displayName;
    private String salaryInfo;

    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "displayName='" + displayName + '\'' +
                ", salaryInfo='" + salaryInfo + '\'' +
                '}';
    }

    // constructor, getters
}

public class StreamEx {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );

        List<String> domains = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1))
                .toList();

        System.out.println(domains);

        Set<String> domains2 = emails.stream()
                .map(email -> email.substring(email.indexOf(".") + 1))
                .collect(Collectors.toSet());

        System.out.println(domains2);

        List<String> domains3 = emails.stream()
                .map(email -> email.substring(email.indexOf("@") + 1, email.indexOf(".")))
                .toList();

        System.out.println(domains3);

        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );

        List<EmployeeDTO> employeeDTOs = employees.stream()
                .map(Employee::toDto)
                .toList();

        System.out.println(employees);
        System.out.println(employeeDTOs);




    }
}
