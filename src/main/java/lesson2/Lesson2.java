package lesson2;

public class Lesson2 {

    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public void checkSumSign(int num1, int num2) {
        int a = num1;
        int b = num2;
        int sum = a + b;
        if (sum >= 0) System.out.println("Sum is positive");
        else System.out.println("Sum is negative");
    }

    public void printColor(int num) {
        int value = num;
        if (value <= 0) System.out.println("Red");
        else if (value > 0 && value <= 100) System.out.println("Yellow");
        else System.out.println("Green");
    }

    public void compareNumbers(int num1, int num2) {
        int a = num1;
        int b = num2;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

    public void checkSumInRange(int num1, int num2) {
        int a = num1;
        int b = num2;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) System.out.println(true);
        else System.out.println(false);
    }

    public void checkNumberSign(int num) {
        if (num >= 0) System.out.println("Number is positive");
        else System.out.println("Number is negative");
    }

    public void checkNumberIsNegative(int num) {
        if (num >= 0) System.out.println(false);
        else System.out.println(true);
    }

    public void printWord(String word, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

    public boolean checkYearIsLeap(int year) {
        boolean result = false;
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0) result = true;
            else if (year % 100 != 0 && year % 400 != 0) result = true;
        }
        return result;
    }

    public void reversNumbersInMassive() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printMassive(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        printMassive(arr);
    }

    public void fillMassive() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        printMassive(arr);
    }

    public void changeMassive() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printMassive(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        printMassive(arr);
    }

    public void fillDiagonalMassive() {
        int[][] arr = new int[5][5];
        printMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
            }
        }
        printMatrix(arr);
    }

    public void fillMassiveValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        printMassive(arr);
    }

    private void printMassive(int[] arr) {
        System.out.print("[ ");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println("]");
    }

    private void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            printMassive(arr);
        }
        System.out.println();
    }

}
