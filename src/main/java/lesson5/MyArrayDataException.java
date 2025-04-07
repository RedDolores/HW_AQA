package lesson5;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException() {
        super("Ошибка формата данных.");
    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String element, int i, int j) {
        this(String.format("Неверный формат для преобразования в: %s, на позиции [%s][%s]", element, i, j));
    }

}
