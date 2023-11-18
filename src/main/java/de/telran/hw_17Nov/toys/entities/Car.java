package de.telran.hw_17Nov.toys.entities;

import de.telran.hw_17Nov.toys.interfaces.ToyInterface;

public class Car implements ToyInterface {
    private String sound;

    public Car(String sound) {
        this.sound = sound;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void voice() {
        System.out.println("I can make this sound: " + sound);
    }
}
