package lesson7_junit5_tests;

import lesson7_junit5.Factorial;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactorialTest {
    private Factorial factorial;

    @BeforeEach
    public void init() {
        factorial = new Factorial();
    }

    @Test
    public void factorialTest() {
        assertTrue(factorial.getFactorial(0) == 1);
        assertTrue(factorial.getFactorial(1) == 1);
        assertTrue(factorial.getFactorial(5) == 120);
    }

    @Test
    public void factorialNegativeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.getFactorial(-1);
        });

    }

}
