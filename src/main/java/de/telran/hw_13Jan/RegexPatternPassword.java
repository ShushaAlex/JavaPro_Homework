package de.telran.hw_13Jan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Написать регулярное выражение для проверки корректности нового пароля, который соответствует определенным критериям:
состоять минимум из 8 символов;
должен обязательно включать хотя бы одну маленькую букву;
должен обязательно включать хотя бы одну большую букву;
должен обязательно включать хотя бы одну цифру;
должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&*_+-=);
 */
public class RegexPatternPassword {
    public static void main(String[] args) {
        String patternStr = "^(?=.+[a-z])(?=.*[A-Z])(?=.+[0-9])(?=.+[!@#\\$%\\^&\\*_\\+-=])([a-zA-Z0-9!@#\\$%\\^&\\*_\\+-=]){8,}$";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher("hjh=87JJoo");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("opopPPPoo");
        System.out.println(matcher.matches());

    }
}
