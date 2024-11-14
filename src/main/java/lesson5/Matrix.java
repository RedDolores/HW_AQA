package lesson5;

public class Matrix {
    private String tempElementMatrix;
    private int tempI;
    private int tempJ;

    public int sumAllElements(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        checkSizeMatrix(matrix);

        try {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    this.tempElementMatrix = matrix[i][j];
                    this.tempI = i;
                    this.tempJ = j;
                    sum += Integer.parseInt(matrix[i][j]);
                }
            }
            return sum;
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(this.tempElementMatrix, this.tempI, this.tempJ);
        }

    }

    private void checkSizeMatrix(String[][] matrix) throws MyArraySizeException {
        int size = 4;
        if (matrix.length != size) {
            throw new MyArraySizeException("Введено строк:", matrix.length, size);
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != size)
                throw new MyArraySizeException("В строке " + i + " введено столбцов:", matrix[i].length, size);
        }

    }

}
