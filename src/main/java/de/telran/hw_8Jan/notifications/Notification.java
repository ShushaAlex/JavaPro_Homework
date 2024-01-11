package de.telran.hw_8Jan.notifications;

import com.github.javafaker.Faker;
import de.telran.hw_8Jan.notifications.reports.HTMLReport;
import de.telran.hw_8Jan.notifications.reports.TextReport;

/*
Написать приложение для рассылки уведомлений о проведении платежа в банке по нескольким каналам передачи данных
Telegram, Viber, WhatsApp, E-Mail.
- метод prepareData у всех каналов одинаковый, получаем данные для подготовки уведомления.
- метод generateReport для Telegram, Viber, WhatsApp генерирует отчет в текстовом виде, а для E-Mail в формате html.
- метод sendReport отправляет отчет, и для каждого из вышеперечисленных каналов - он отличается по реализацию
Спроектируйте классы для реализации данного приложение и напишите методы, с примитивной логикой.
При проектировании используйте Generic методы и перегрузку.
 */
public class Notification {
    private static String prepareData () {
        return new Faker().bothify("????##@gmail.com");
    }
    private static <T extends TextReport> T generateReport () {
        TextReport report = new TextReport(prepareData(), new Faker().harryPotter().quote());
        return (T) report;
    }

    private static void sendReport (TextReport report, String messenger) {
        System.out.printf("Your report %s is sent. Please, check your %s", report, messenger);
    }

    private static void sendReport (HTMLReport report) {
        System.out.printf("Your report %s is sent. Please, check your Email", report);
    }

    // что-то второе задание не получается нормально сделать, метод с дженериком не работает
}
