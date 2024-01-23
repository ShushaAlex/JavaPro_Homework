package de.telran.hw_19Jan;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateDemo {

    // 1) реализовать метод, который принимает год и проверяет на високоснасть
    private static boolean isLeap(int year) {
        return LocalDate.of(year, 1, 1).isLeapYear();
    }

    public static void main(String[] args) {

        System.out.println(isLeap(1996));
        System.out.println(isLeap(1997));

        // 2) вывести на консоль дату, локализованную для Индии (например)
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.forLanguageTag("hi"));
        String formattedDate = LocalDate.now().format(pattern);
        System.out.println(formattedDate);

        // 3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy, d, D, HH:mm");
        System.out.println(formatter.format(LocalDateTime.now()));

        // 4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.forLanguageTag("ru"));
        String myBD = LocalDate.of(1996, Month.APRIL, 20).format(formatter1);
        System.out.println(myBD);

        // 5) проверить дата "10 Января 1985" - это пятница?
        Calendar calendar = new GregorianCalendar();
        calendar.set(1985, Calendar.JANUARY, 10);
        if (calendar.DAY_OF_WEEK == 6) {
            System.out.println("It's Friday");
        } else {
            System.out.println("It's not Friday");
        }
        // 6) вычесть 10 лет из созданной даты, вывести на консоль
        LocalDate date = LocalDate.now();
        System.out.println(date.minusYears(10));

        // 7) получить объект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
        Instant dateFromStr = Instant.parse("2022-12-19T06:55:30.00Z");
        System.out.println(dateFromStr);

        // 8) получить ZonedDateTime из "Pacific/Midway", вывести на консоль
        ZonedDateTime pacTime = ZonedDateTime.now(ZoneId.of("Pacific/Midway"));
        System.out.println(pacTime);

    }
}
