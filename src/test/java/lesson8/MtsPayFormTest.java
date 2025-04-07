package lesson8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MtsPayFormTest {
    WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        if (driver.findElement(By.xpath("//button[contains(text(), 'Отклонить')]")).isDisplayed()) {
            driver.findElement(By.xpath("//button[contains(text(), 'Отклонить')]")).click();
        }
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void testTitle() {
        WebElement title = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/h2"));
        String txt = "Онлайн пополнение\nбез комиссии";
        assertEquals(txt, title.getText());
    }

    @Test
    void testIconVisa() {
        WebElement icon = driver.findElement(By.xpath("//div[@class = 'pay__partners']//img[@alt = 'Visa']"));
        assertEquals("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg", icon.getAttribute("src"));
    }

    @Test
    void testIconVerifiedByVisa() {
        WebElement icon = driver.findElement(By.xpath("//div[@class = 'pay__partners']//img[@alt = 'Verified By Visa']"));
        assertEquals("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg", icon.getAttribute("src"));
    }

    @Test
    void testIconMasterCard() {
        WebElement icon = driver.findElement(By.xpath("//div[@class = 'pay__partners']//img[@alt = 'MasterCard']"));
        assertEquals("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg", icon.getAttribute("src"));
    }

    @Test
    void testIconMasterCardSecureCode() {
        WebElement icon = driver.findElement(By.xpath("//div[@class = 'pay__partners']//img[@alt = 'MasterCard Secure Code']"));
        assertEquals("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg", icon.getAttribute("src"));
    }

    @Test
    void testIconBelcart() {
        WebElement icon = driver.findElement(By.xpath("//div[@class = 'pay__partners']//img[@alt = 'Белкарт']"));
        assertEquals("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg", icon.getAttribute("src"));
    }

    @Test
    void testMoreInfo() {
        WebElement link = driver.findElement(By.xpath("//div[@class = 'pay__wrapper']/a[text() = 'Подробнее о сервисе']"));
        link.click();
        assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }

    @Test
    void testPayFormConnection() {
        String testPhoneNumber = "297777777";
        driver.findElement(By.xpath("//div[@class = 'select__wrapper']")).click();
        driver.findElement(By.xpath("//li[contains(. , 'Услуги связи')]")).click();

        WebElement inputPhone = driver.findElement(By.xpath("//input[@id = 'connection-phone']"));
        inputPhone.click();
        inputPhone.sendKeys(testPhoneNumber);

        WebElement inputSumPay = driver.findElement(By.xpath("//input[@id = 'connection-sum']"));
        inputSumPay.click();
        inputSumPay.sendKeys("100");

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//form[@class = 'pay-form opened']/button[@class = 'button button__default ']")).click();

        WebElement payWindow = driver.findElement(By.xpath("//body/div[@class = 'bepaid-app']"));

        assertTrue(payWindow.isDisplayed());
    }

}
