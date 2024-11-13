package lesson5;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
        super("Неверный размер матрицы.");
    }

    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, int position, int size) {
        this(String.format("%s %s, вместо %s.", message, position, size));
    }
}
