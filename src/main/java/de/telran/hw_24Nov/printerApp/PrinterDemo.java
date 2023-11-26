package de.telran.hw_24Nov.printerApp;
/*
У вас на работе стоит всего один принтер, который умеет сканировать и ксерокопировать. Реализуйте класс,
который позволит вам реализовать последовательный доступ сотрудников для выполнения вышеуказанных операций
на этом принтере.
 */
public class PrinterDemo {
    public static void main(String[] args) {
        Printer printer1 = Printer.getPrinter("Cannon", 40);
        Printer printer2 = Printer.getPrinter("Xerox", 30);
        System.out.println(printer2 == printer1);
        printer1.setName("Xerox");
        System.out.println(printer2);
    }
}
