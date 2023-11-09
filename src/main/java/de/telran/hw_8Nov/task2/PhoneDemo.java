package de.telran.hw_8Nov.task2;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+49123456", "Samsung", 158.3);
        Phone phone2 = new Phone("+49098765", "Xiaomi", 216.6);
        Phone phone3 = new Phone("+49678943", "Sony", 205.8);

        System.out.println("model: " + phone1.model + ", weight: " + phone1.weight + ", number: " + phone1.getNumber());
        System.out.println("model: " + phone2.model + ", weight: " + phone2.weight + ", number: " + phone2.getNumber());
        System.out.println("model: " + phone3.model + ", weight: " + phone3.weight + ", number: " + phone3.getNumber());

        phone1.receiveCall("Alex");
        phone2.receiveCall("Jack");
        phone3.receiveCall("Julia");
    }
}
