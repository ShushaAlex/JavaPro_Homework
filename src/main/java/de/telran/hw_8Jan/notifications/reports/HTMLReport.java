package de.telran.hw_8Jan.notifications.reports;
public class HTMLReport extends TextReport{
    private String email;
    private String text;

    public HTMLReport(String email, String text) {
        super(email, text);
    }

    @Override
    public String toString() {
        return "HTMLReport{" +
                "email='" + email + '\'' +
                ", text='" + text + '\'' +
                "} " + super.toString();
    }
}
