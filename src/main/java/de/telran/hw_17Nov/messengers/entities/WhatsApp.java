package de.telran.hw_17Nov.messengers.entities;

import de.telran.hw_17Nov.messengers.Messenger;

public class WhatsApp implements Messenger {
    private String message;
    @Override
    public void sendMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        System.out.println("You have unread message: " + message);
        return message;
    }
}
