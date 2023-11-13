package de.telran.hw_11Nov.task1.descriptionClasses;

public class Engineer extends Employee {
    private String position;
    private int salary;

    public Engineer(String gender, String nationality, int age, String company, String position, int salary) {
        super(gender, nationality, age, company);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "position = " + position +
                ", salary = " + salary +
                ", gender = " + gender +
                ", nationality = " + nationality +
                ", age = " + age;
    }
}
