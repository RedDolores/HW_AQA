package lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OnlinePaymentFormTest {
    public static WebDriver driver;
    public static OnlinePaymentForm onlinePaymentForm;
    public static HelpPage helpPage;
    public static PayForm payForm;
    public static WebDriverWait wait;


    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        wait = new WebDriverWait(driver, 3);
        onlinePaymentForm = new OnlinePaymentForm(driver);
        helpPage = new HelpPage(driver);
        payForm = new PayForm(driver);
        onlinePaymentForm.discardCookie();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка заголовка формы")
     void testTitle() {
        String txt = "Онлайн пополнение\nбез комиссии";
        assertEquals(txt, onlinePaymentForm.getTitle());
    }

    @Test
    @DisplayName("Проверка наличия иконки Visa")
    void testIconVisa() {
        assertEquals("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg", onlinePaymentForm.getIconVisa());
    }

    @Test
    @DisplayName("Проверка наличия иконки Verified By Visa")
    void testIconVerifiedByVisa() {
        assertEquals("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg", onlinePaymentForm.getIconVerifiedByVisa());
    }

    @Test
    @DisplayName("Проверка наличия иконки MasterCard")
    void testIconMasterCard() {
        assertEquals("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg", onlinePaymentForm.getIconMasterCard());
    }

    @Test
    @DisplayName("Проверка наличия иконки MasterCard Secure Code")
    void testIconMasterCardSecureCode() {
        assertEquals("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg", onlinePaymentForm.getIconMasterCardSecureCode());
    }

    @Test
    @DisplayName("Проверка наличия иконки Белкарт")
    void testIconBelkart() {
        assertEquals("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg", onlinePaymentForm.getIconBelkart());
    }

    @Test
    @DisplayName("Проверка ссылки \"Подробнее о сервисе\"")
    void testMoreInfo() {
        assertTrue(helpPage.getUrlPage().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
    }

    @Test
    @DisplayName("Проверка отображения формы для оплаты")
    void testPayFormConnection() {
        String testPhoneNumber = "297777777";
        String testSum = "100";
        onlinePaymentForm.selectConnection();
        onlinePaymentForm.fillPaymentForm(testPhoneNumber, testSum);
        wait.until(ExpectedConditions.visibilityOf(payForm.getPayWindow()));
        assertTrue(payForm.payFormIsDisplayed());
    }

    @Test
    @DisplayName("Проверка наличия плейсхолдеров в форме")
    void testPlaceholders() {
        assertEquals("Номер телефона", onlinePaymentForm.getPlaceholderPhone());
        assertEquals("Сумма", onlinePaymentForm.getPlaceholderSumPay());
        assertEquals("E-mail для отправки чека", onlinePaymentForm.getPlaceholderEmail());
        assertEquals("Номер абонента", onlinePaymentForm.getPlaceholderInternetPhone());
        assertEquals("Сумма", onlinePaymentForm.getPlaceholderInternetSumPay());
        assertEquals("E-mail для отправки чека", onlinePaymentForm.getPlaceholderInternetEmail());
        assertEquals("Номер счета на 44", onlinePaymentForm.getPlaceholderInstalmentNumber());
        assertEquals("Сумма", onlinePaymentForm.getPlaceholderInstalmentSumPay());
        assertEquals("E-mail для отправки чека", onlinePaymentForm.getPlaceholderInstalmentEmail());
        assertEquals("Номер счета на 2073", onlinePaymentForm.getPlaceholderArrearsNumber());
        assertEquals("Сумма", onlinePaymentForm.getPlaceholderArrearsSumPay());
        assertEquals("E-mail для отправки чека", onlinePaymentForm.getPlaceholderArrearsEmail());
    }

}
