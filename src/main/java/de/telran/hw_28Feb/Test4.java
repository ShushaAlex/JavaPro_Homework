package de.telran.hw_28Feb;

public class Test4 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new NullPointerException();
        } finally {
            throw new RuntimeException("1");
        }
    }
}


