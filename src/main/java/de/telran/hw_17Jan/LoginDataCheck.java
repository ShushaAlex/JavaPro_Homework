package de.telran.hw_17Jan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
Login должен содержать только латинские буквы, цифры и знак подчеркивания.
Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов.
Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception.
Обработка исключений проводится в вызывающем методе.
Используем multi-catch block.
Метод возвращает true, если значения верны или false в другом случае.
*/
public class LoginDataCheck {

    public static void main(String[] args) throws Exception {
        String login = "Alex_G6";
        String password = "ioIO12_";
        String confirmPass = "ioIO12_";

        //верные данные
        System.out.println(isLoginDataCorrect(login, password, confirmPass));
        // неверный логин
        login = "Alex_G6-";
        System.out.println(isLoginDataCorrect(login, password, confirmPass));
        login = "Alex_G6";
        //неверный пароль
        password = "ioIO12_000000000000000000000000000";
        System.out.println(isLoginDataCorrect(login, password, confirmPass));
        password = "ioIO12_";
        //не совпадают пароли
        confirmPass = "ioIO12_i";
        System.out.println(isLoginDataCorrect(login, password, confirmPass));
    }
    public static boolean isLoginDataCorrect(String login, String password, String confirmPassword) throws Exception {
        String loginPasswordRegex = "^[\\w]{1,20}$";
        Pattern loginPasswordPat = Pattern.compile(loginPasswordRegex);
        Matcher matcher = loginPasswordPat.matcher(login);
        try {
            if(!matcher.matches())
                throw new WrongLoginException("Wrong login");
            matcher = loginPasswordPat.matcher(password);
            if(!matcher.matches() || !password.equals(confirmPassword))
                throw new WrongPasswordException("Password is incorrect");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[0m");
            return false;
        }
        return true;
    }

}
