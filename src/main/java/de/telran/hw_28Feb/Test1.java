package de.telran.hw_28Feb;


public class Test1 {
    {
        System.out.println("2");
    }

    static {
        System.out.println("1");
    }

    public Test1() {
        System.out.println("3");
    }

    public static void main(String[] args) {
        new Test1();
        new Test1();
    }
}

