package de.telran.hw_17Nov.toys.interfaces;

public interface ToyInterface {
    void setSound(String sound);
    default void beSafe() {
        System.out.println("I am TÜV checked");
    }
    default void remoteControl() {
        System.out.println("I am remote controlled");
    }
    void voice();
}
