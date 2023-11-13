package de.telran.hw_11Nov.task1.descriptionClasses;

public class Human extends Earthling {
    protected String gender;
    protected String nationality;
    protected int age;

    public Human(String gender, String nationality, int age) {
        this.gender = gender;
        this.nationality = nationality;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }
}
