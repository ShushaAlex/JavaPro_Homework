package de.telran.hw_28Feb.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton.INSTANCE.setCount(10);
        Singleton.INSTANCE.showCount();
        Singleton.INSTANCE.setCount(Singleton.INSTANCE.getCount() + 2);
        Singleton.INSTANCE.showCount();
    }
}
