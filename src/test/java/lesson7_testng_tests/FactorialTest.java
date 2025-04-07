package lesson7_testng_tests;

import lesson7_testng.Factorial;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class FactorialTest {

    private Factorial factorial;

    @BeforeMethod
    public void init() {
        factorial = new Factorial();
    }

    @Test
    public void factorialTest() {
        assertEquals(factorial.getFactorial(0), 1);
        assertEquals(factorial.getFactorial(1), 1);
        assertEquals(factorial.getFactorial(5), 120);
    }

    @Test
    public void factorialNegativeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            factorial.getFactorial(-1);
        });

    }

}
