package lesson11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayFormTest {
    public static WebDriver driver;
    public static OnlinePaymentForm onlinePaymentForm;
    public static PayForm payForm;
    public static WebDriverWait wait;
    public String testPhoneNumber = "297777777";
    public String testSum = "100";

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
        payForm = new PayForm(driver);
        onlinePaymentForm.discardCookie();
        onlinePaymentForm.selectConnection();
        onlinePaymentForm.fillPaymentForm(testPhoneNumber, testSum);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-wrapper__content']")));
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка отображения суммы в заголовке формы для оплаты")
    void testTitleSum() {
        assertEquals("100.00 BYN", payForm.getTitleSum());
    }

    @Test
    @DisplayName("Проверка отображения номера телефона в заголовке формы для оплаты")
    void testTitlePhone() {
        assertEquals("Оплата: Услуги связи Номер:375" + testPhoneNumber, payForm.getTitlePhone());
    }

    @Test
    @DisplayName("Проверка наличия плейсхолдера в поле \"Номер карты\"")
    void testPlaceholderCreditCard() {
        assertEquals("Номер карты", payForm.getPlaceholderCreditCard());
    }

    @Test
    @DisplayName("Проверка наличия плейсхолдера в поле \"Срок действия\"")
    void testPlaceholderExpirationDate() {
        assertEquals("Срок действия", payForm.getPlaceholderExpirationDate());
    }

    @Test
    @DisplayName("Проверка наличия плейсхолдера в поле \"CVC\"")
    void testPlaceholderCVC() {
        assertEquals("CVC", payForm.getPlaceholderCVC());
    }

    @Test
    @DisplayName("Проверка наличия плейсхолдера в поле \"Имя держателя\"")
    void testPlaceholderCardHolder() {
        assertEquals("Имя держателя (как на карте)", payForm.getPlaceholderCardHolder());
    }


    @Test
    @DisplayName("Проверка отображения суммы на кнопке оплаты")
    void testTitleButtonSubmit() {
        assertEquals("Оплатить 100.00 BYN", payForm.getTitleButtonSubmit());
    }


    @Test
    @DisplayName("Проверка наличия иконки Visa")
    void testIconVisaSystem() {
        assertEquals("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/visa-system.svg", payForm.getIconVisaSystem());
    }

    @Test
    @DisplayName("Проверка наличия иконки MasterCard")
    void testIconMastercardSystem() {
        assertEquals("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mastercard-system.svg", payForm.getIconMastercardSystem());
    }

    @Test
    @DisplayName("Проверка наличия иконки Белкарт")
    void testIconBelkartSystem() {
        assertEquals("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/belkart-system.svg", payForm.getIconBelkartSystem());
    }

    @Test
    @DisplayName("Проверка наличия иконки Maestro")
    void testIconMaestroSystem() {
        assertEquals("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/maestro-system.svg", payForm.getIconMaestroSystem());
    }

    @Test
    @DisplayName("Проверка наличия иконки МИР")
    void testIconMirSystemRu() {
        assertEquals("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mir-system-ru.svg", payForm.getIconMirSystemRu());
    }

}