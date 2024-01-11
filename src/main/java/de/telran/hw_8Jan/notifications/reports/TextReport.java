package de.telran.hw_8Jan.notifications.reports;

public class TextReport {
    private String email;
    private String text;

    public TextReport(String email, String text) {
        this.email = email;
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextReport{" +
                "email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
