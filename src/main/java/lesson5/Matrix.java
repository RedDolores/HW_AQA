package lesson5;

public class Matrix {
    public String tempElementMatrix;
    public int tempI;
    public int tempJ;

    public void sumAllElements(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int size = 4;
        int sum = 0;
        if (matrix.length != size) {
            throw new MyArraySizeException("Введено строк:", matrix.length, size);
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != size)
                throw new MyArraySizeException("В строке " + i + " введено столбцов:", matrix[i].length, size);
        }

        try {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    this.tempElementMatrix = matrix[i][j];
                    this.tempI = i;
                    this.tempJ = j;
                    sum += Integer.parseInt(matrix[i][j]);
                }
            }
            System.out.println("Сумма всех эллементов матрицы: " + sum);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(this.tempElementMatrix, this.tempI, this.tempJ);
        }

    }
}
