package lesson5;

public class Main {
    public static void main(String[] args) {
        String[][] matrix1 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] matrix2 = {{"1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] matrix3 = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] matrix4 = {{"1", "1", "1", "1"}, {"1", "1", "a", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};

        Matrix matrix = new Matrix();

        try {
            matrix.sumAllElements(matrix2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }
}
