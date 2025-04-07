package lesson6;

import java.io.IOException;
import java.util.Scanner;

public class View {

    private String name;
    private String number;
    private int command;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getCommand() {
        return command;
    }

    public void readCommand() {
        System.out.println("Введите номер команды: \n" +
                "1. Вывести все контакты.\n" +
                "2. Добавить контакт.\n" +
                "3. Поиск контакта \n" +
                "4. Выход. \n");
        try {
            String command = scanner();
            checkEmpty(command);
            int commandNumber = Integer.parseInt(command);
            if (commandNumber < 1 || commandNumber > 4) {
                throw new IOException();
            }
            this.command = commandNumber;

        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка ввода. Повторите попытку.");
            readCommand();
        }
    }

    public void readNameAndNumber() {
        readName();
        readNumber();
    }

    public void readName() {
        System.out.println("Введите имя: ");
        try {
            String name = scanner();
            checkEmpty(name);
            this.name = name;
        } catch (IOException e) {
            System.out.println("Поле не может быть пустым. Повторите попытку.");
            readName();
        }

    }

    private void readNumber() {
        System.out.println("Введите номер телефона: ");
        try {
            String number = scanner();
            checkEmpty(number);
            this.number = number;
        } catch (IOException e) {
            System.out.println("Поле не может быть пустым. Повторите попытку.");
            readNumber();
        }

    }

    private void checkEmpty(String data) throws IOException {
        if (data.trim().isEmpty()) {
            throw new IOException();
        }
    }

    private String scanner() {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        return st;
    }

}
