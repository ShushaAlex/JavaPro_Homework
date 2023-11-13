package de.telran.hw_11Nov.task1.descriptionClasses;

public class Employee extends Human{
    private String company;

    public Employee(String gender, String nationality, int age, String company) {
        super(gender, nationality, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return "company = " + company +
                ", gender = " + gender +
                ", nationality = " + nationality +
                ", age = " + age;
    }
}
