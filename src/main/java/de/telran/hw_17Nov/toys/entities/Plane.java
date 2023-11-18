package de.telran.hw_17Nov.toys.entities;

import de.telran.hw_17Nov.toys.interfaces.PlaneInterface;

public class Plane implements PlaneInterface {
    private String sound;

    public Plane(String sound) {
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
