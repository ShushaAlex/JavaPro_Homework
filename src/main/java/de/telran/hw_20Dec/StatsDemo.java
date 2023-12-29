package de.telran.hw_20Dec;

import java.util.List;

public class StatsDemo {
    public static void main(String[] args) {
        Statistic stat = new Statistic();
        List<Employee> employees = List.of(
                new Employee("Anna", "Manager", "Sales", 1500),
                new Employee("Iren", "Manager", "IT", 2350),
                new Employee("Maria", "Director", "Sales", 10467),
                new Employee("Paul", "Programmer", "IT", 4600),
                new Employee("Peter", "Manager", "Sales", 2050),
                new Employee("Madina", "Manager", "Finance", 3000),
                new Employee("Barb", "Manager", "Sales", 2980),
                new Employee("Anna", "HR-manager", "HR", 2800),
                new Employee("Marina", "Assistant", "HR", 1000),
                new Employee("Michael", "manager", "Marketing", 2800),
                new Employee("Johanna", "Top-manager", "Marketing", 4700)
        );

        System.out.println(stat.avgSalary(employees));
        System.out.println(stat.getEmployeesBySalary(employees, 2700));
        System.out.println(stat.getMarketingEmployees(employees));
        System.out.println(stat.getMinPaidEmployee(employees));
        System.out.println(stat.getMaxPaidEmployee(employees));
        System.out.println(stat.groupByMaxSalaryDep(employees));
        System.out.println(stat.groupByPosition(employees));
    }
}
