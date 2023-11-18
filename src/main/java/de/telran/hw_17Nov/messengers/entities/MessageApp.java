package de.telran.hw_17Nov.messengers.entities;
/* Есть интерфейс Messenger с
   void sendMessage(String message);
   String getMessage();
   Реализуйте 3 класса: Viber, Telegram и WhatsApp, которые умеют выполнять эти действия.
*/
public class MessageApp {
    public static void main(String[] args) {

        Telegram telegram = new Telegram();
        WhatsApp whatsApp = new WhatsApp();
        Viber viber = new Viber();

        whatsApp.sendMessage("Hello, I,m using WhatsApp!");
        whatsApp.getMessage();

        telegram.sendMessage("Hello, I,m using Telegram!");
        telegram.getMessage();

        viber.sendMessage("Hello, I,m using Viber!");
        viber.getMessage();
    }
}
