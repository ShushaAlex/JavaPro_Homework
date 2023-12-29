package de.telran.hw_20Dec;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Statistic {
    // Вычислить среднюю зарплату всех сотрудников
    public double avgSalary (List<Employee> employees) {
        OptionalDouble avg = employees.stream()
                .mapToInt(Employee::getSalary)
                .average();
        return avg.isPresent() ? avg.getAsDouble() : 0;
    }
    // Получить список сотрудников с зп > 1000
    public List<Employee> getEmployeesBySalary (List<Employee> employees, int salary) {
        return employees.stream()
                .filter(x -> x.getSalary() > salary)
                .toList();
    }
    // Получить список сотрудников из отдела маркетинг
    public List<Employee> getMarketingEmployees (List<Employee> employees) {
        return employees.stream()
                .filter(x -> x.getDepartment().equals("Marketing"))
                .toList();
    }

    // Получить сотрудника с самой низкой зп
    public Employee getMinPaidEmployee (List<Employee> employees) {
        Optional<Employee> minSalary = employees.stream()
                .min(Comparator.comparingInt(x -> x.getSalary()));
        return minSalary.get();
    }
    //Получить сотрудника с самой высокой зп
    public Employee getMaxPaidEmployee (List<Employee> employees) {
        Optional<Employee> maxSalary = employees.stream().
                max(Comparator.comparingInt(Employee :: getSalary));
        return maxSalary.get();
    }
    // Получите сотрудников из всех отделов с максимальной зп **** Collectors.partitioningBy()
    public Map<String, Optional<Employee>> groupByMaxSalaryDep (List<Employee> employees) {
        return employees.stream()
                .collect(groupingBy(Employee :: getDepartment, maxBy(Comparator.comparingInt(Employee :: getSalary))));
    }

    // Сгруппировать сотрудников по должности
    public Map<String, List<Employee>> groupByPosition (List<Employee> employees) {
        return employees.stream()
                .collect(groupingBy(Employee :: getPosition));
    }
}
