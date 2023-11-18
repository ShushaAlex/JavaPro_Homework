package de.telran.hw_17Nov.toys.entities;

import de.telran.hw_17Nov.toys.interfaces.BoatInterface;

public class Boat implements BoatInterface {
    private String sound;

    public Boat(String sound) {
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
