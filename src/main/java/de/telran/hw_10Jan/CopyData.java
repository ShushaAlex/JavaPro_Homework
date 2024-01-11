package de.telran.hw_10Jan;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Написать приложение, которое будет копировать информацию из файла в другой файл.
Путь к существующему файлу и имя нового файла нужно вводить с клавиатуры.
 */
public class CopyData {
    public static void main(String[] args) {
        /*
        Origin - /Users/alex/IdeaProjects/JavaPro_Homework/src/main/java/de/telran/hw_10Jan/testFile.txt
        New - /Users/alex/IdeaProjects/JavaPro_Homework/src/main/java/de/telran/hw_10Jan/newFile.txt
         */
        copyFile();
    }

    private static void copyFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter origin file path: ");
        String originFile = scanner.next();
        System.out.print("Please, enter new file path: ");
        String newFile = scanner.next();
        String text = readFile(originFile);
        wrightToFile(text, newFile);
    }

    private static String readFile(String path) {
        StringBuilder text = new StringBuilder();
        try (FileReader fileReader = new FileReader(path)) {
            int characters;
            while ((characters = fileReader.read()) != -1) {
                text.append((char) characters);
            }
        } catch (Exception e) {
            throw new NullPointerException();
        }
        return text.toString();
    }

    private static void wrightToFile(String text, String path) {
        try (FileWriter writer = new FileWriter(path)){
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }
            System.out.println("Done!");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
