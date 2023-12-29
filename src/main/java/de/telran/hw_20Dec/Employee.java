package de.telran.hw_20Dec;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Employee {
    String fullName;
    String position;
    String department;
    int salary;
}
