package lesson7_junit5;

public class Factorial {

    public int getFactorial(int num) {
        if (num < 0)
            throw new IllegalArgumentException();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}

