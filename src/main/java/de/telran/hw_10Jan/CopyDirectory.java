package de.telran.hw_10Jan;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Написать приложение, которое будет копировать содержимое одной папки в другую со всеми вложениями
(другие папки, файлы).
Путь к существующей папке и имя новой папки нужно вводить с клавиатуры.
 */
public class CopyDirectory {
    public static void main(String[] args) {
        String origin = "/Users/alex/IdeaProjects/JavaPro_Homework/src/main/java/de/telran/hw_10Jan/origin";
        String copyTo = "/Users/alex/IdeaProjects/JavaPro_Homework/src/main/java/de/telran/hw_10Jan/copied";
        copyFiles(origin, copyTo);
    }

    public static void copyFiles(String originPath, String copyToPath) {
        File origin = new File(originPath);
        copyDir(copyToPath + '/' + origin.getName());
        File[] files = origin.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    originPath = file.getPath();
                    copyToPath = copyToPath + '/' + file.getName();
                    copyFiles(originPath, copyToPath);
                } else {
                    writeToFile(originPath, copyToPath);
                }
            }
        }
        copyDir(copyToPath);
    }

    public static void copyDir(String copyTo) {
            File copyFile = new File(copyTo);
            copyFile.mkdir();
    }

    public static void writeToFile(String originPath, String copyToPath) {
        try (FileWriter writer = new FileWriter(copyToPath)) {
            try (FileReader reader = new FileReader(originPath)) {
                int symbol;
                while ((symbol = reader.read()) != 0) {
                    writer.write((char)symbol);
                }
            } catch (Exception e) {
                throw new NullPointerException();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
