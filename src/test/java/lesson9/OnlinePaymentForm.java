package lesson9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlinePaymentForm {
    public WebDriver driver;

    public OnlinePaymentForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class = 'pay__wrapper']/h2")
    private WebElement titleForm;

    @FindBy(xpath = "//div[@class = 'pay__partners']//img[@alt = 'Visa']")
    private WebElement iconVisa;

    @FindBy(xpath = "//div[@class = 'pay__partners']//img[@alt = 'Verified By Visa']")
    private WebElement iconVerifiedByVisa;

    @FindBy(xpath = "//div[@class = 'pay__partners']//img[@alt = 'MasterCard']")
    private WebElement iconMasterCard;

    @FindBy(xpath = "//div[@class = 'pay__partners']//img[@alt = 'MasterCard Secure Code']")
    private WebElement iconMasterCardSecureCode;

    @FindBy(xpath = "//div[@class = 'pay__partners']//img[@alt = 'Белкарт']")
    private WebElement iconBelcart;

    @FindBy(xpath = "//div[@class = 'pay__wrapper']/a[text() = 'Подробнее о сервисе']")
    private WebElement linkMoreInfo;

    @FindBy(xpath = "//div[@class = 'select__wrapper']")
    private WebElement selector;

    @FindBy(xpath = "//li[contains(. , 'Услуги связи')]")
    private WebElement selectorConnection;

    @FindBy(xpath = "//input[@id = 'connection-phone']")
    private WebElement inputPhone;

    @FindBy(xpath = "//input[@id = 'connection-sum']")
    private WebElement inputSumPay;

    @FindBy(xpath = "//form[@class = 'pay-form opened']/button[@class = 'button button__default ']")
    private WebElement buttonContinue;

    public String getTitle(){
        return titleForm.getText();
    }

    public String getIconVisa(){
        return iconVisa.getDomAttribute("src");
    }




}
