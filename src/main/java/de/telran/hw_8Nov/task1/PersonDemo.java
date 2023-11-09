package de.telran.hw_8Nov.task1;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Sarah Connor";
        person1.age = 25;
        Person person2 = new Person("John Smith", 56);

        person1.talk("Hello, my friend!");
        person2.talk("I'm your father!");
        person1.move("hand");
        person2.move("leg");
    }
}
