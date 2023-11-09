package de.telran.hw_8Nov.task1;
public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    void talk(String message) {
        System.out.println(fullName + " says: " + message);
    }
    void move(String bodyPart) {
        System.out.println(fullName + " moves " + bodyPart);
    }
}
