package de.telran.hw_13Jan;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1. Написать регулярное выражение для проверки email (например my_25@domen-38.de).
 */
public class RegexPatternEmail {
    public static void main(String[] args) {
        String email = "my_25@domen-38.de";
        String validEmail = "mydomen-2@gmail.com";
        String matcherStr = "";
        String regex = "^[\\w\\d.-]{2,}@[\\w\\d.-]{2,64}\\.[a-zA-Z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        String[] emails = new String[10];
        Faker faker = new Faker();
        for (int i = 0; i < 8; i++) {
            emails[i] = faker.harryPotter().spell();
        }
        emails[8] = email;
        emails[9] = validEmail;

        Map<String, String> validations = new HashMap<>();

        for (String s : emails) {
            matcher = pattern.matcher(s);
            if (matcher.matches()) {
                validations.put(s, "Valid");
            } else {
                validations.put(s, "Invalid");
            }
        }
        System.out.println(validations);
    }
}
