package lesson9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnlinePaymentFormTest {
    public static WebDriver driver;
    public static OnlinePaymentForm onlinePaymentForm;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        onlinePaymentForm = new OnlinePaymentForm(driver);
    }

    @BeforeEach
    void setupTest() {



    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void titleTest(){
        String txt = "Онлайн пополнение\nбез комиссии";
        assertEquals(txt, onlinePaymentForm.getTitle());

    }
}
