package de.telran.hw_11Nov.task1;

import de.telran.hw_11Nov.task1.descriptionClasses.Employee;
import de.telran.hw_11Nov.task1.descriptionClasses.Engineer;

public class EmployeeDemo {
    public static void main(String[] args) {
        Engineer engineer1 = new Engineer("female", "german", 29, "PWC", "senior backend dev", 70600);

        engineer1.sayHi();
        System.out.println(engineer1);
    }
}
