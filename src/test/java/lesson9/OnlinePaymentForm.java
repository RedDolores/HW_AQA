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

    @FindBy(xpath = "//button[contains(text(), 'Отклонить')]")
    private WebElement cookie;

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
    private WebElement iconBelkart;

    @FindBy(xpath = "//div[@class = 'pay__wrapper']/a[text() = 'Подробнее о сервисе']")
    private WebElement linkMoreInfo;

    @FindBy(xpath = "//div[@class = 'select__wrapper']")
    private WebElement selector;

    @FindBy(xpath = "//li[contains(. , 'Услуги связи')]")
    private WebElement selectorConnection;

    @FindBy(xpath = "//input[@id = 'connection-phone']")
    private WebElement fieldPhone;

    @FindBy(xpath = "//input[@id = 'connection-sum']")
    private WebElement fieldSumPay;

    @FindBy(xpath = "//input[@id = 'connection-email']")
    private WebElement fieldEmail;

    @FindBy(xpath = "//input[@id = 'internet-phone']")
    private WebElement fieldInternetPhone;

    @FindBy(xpath = "//input[@id = 'internet-sum']")
    private WebElement fieldInternetSumPay;

    @FindBy(xpath = "//input[@id = 'internet-email']")
    private WebElement fieldInternetEmail;

    @FindBy(xpath = "//input[@id = 'score-instalment']")
    private WebElement fieldInstalmentNumber;

    @FindBy(xpath = "//input[@id = 'instalment-sum']")
    private WebElement fieldInstalmentSumPay;

    @FindBy(xpath = "//input[@id = 'instalment-email']")
    private WebElement fieldInstalmentEmail;

    @FindBy(xpath = "//input[@id = 'score-arrears']")
    private WebElement fieldArrearsNumber;

    @FindBy(xpath = "//input[@id = 'arrears-sum']")
    private WebElement fieldArrearsSumPay;

    @FindBy(xpath = "//input[@id = 'arrears-email']")
    private WebElement fieldArrearsEmail;

    @FindBy(xpath = "//form[@class = 'pay-form opened']/button[@class = 'button button__default ']")
    private WebElement buttonContinue;


    public void discardCookie() {
        if (cookie.isDisplayed()) cookie.click();
    }

    public String getTitle() {
        return titleForm.getText();
    }

    public String getIconVisa() {
        return iconVisa.getAttribute("src");
    }

    public String getIconVerifiedByVisa() {
        return iconVerifiedByVisa.getAttribute("src");
    }

    public String getIconMasterCard() {
        return iconMasterCard.getAttribute("src");
    }

    public String getIconMasterCardSecureCode() {
        return iconMasterCardSecureCode.getAttribute("src");
    }

    public String getIconBelkart() {
        return iconBelkart.getAttribute("src");
    }

    public String getPlaceholderPhone() {
        return fieldPhone.getAttribute("placeholder");
    }

    public String getPlaceholderSumPay() {
        return fieldSumPay.getAttribute("placeholder");
    }

    public String getPlaceholderEmail() {
        return fieldEmail.getAttribute("placeholder");
    }

    public String getPlaceholderInternetPhone() {
        return fieldInternetPhone.getAttribute("placeholder");
    }

    public String getPlaceholderInternetSumPay() {
        return fieldInternetSumPay.getAttribute("placeholder");
    }

    public String getPlaceholderInternetEmail() {
        return fieldInternetEmail.getAttribute("placeholder");
    }

    public String getPlaceholderInstalmentNumber() {
        return fieldInstalmentNumber.getAttribute("placeholder");
    }

    public String getPlaceholderInstalmentSumPay() {
        return fieldInstalmentSumPay.getAttribute("placeholder");
    }

    public String getPlaceholderInstalmentEmail() {
        return fieldInstalmentEmail.getAttribute("placeholder");
    }

    public String getPlaceholderArrearsNumber() {
        return fieldArrearsNumber.getAttribute("placeholder");
    }

    public String getPlaceholderArrearsSumPay() {
        return fieldArrearsSumPay.getAttribute("placeholder");
    }

    public String getPlaceholderArrearsEmail() {
        return fieldArrearsEmail.getAttribute("placeholder");
    }

    public void selectConnection() {
        selector.click();
        selectorConnection.click();
    }

    public void inputPhone(String phone) {
        fieldPhone.click();
        fieldPhone.sendKeys(phone);
    }

    public void inputSumPay(String sum) {
        fieldSumPay.click();
        fieldSumPay.sendKeys(sum);
    }

    public void clickButtonContinue() {
        buttonContinue.click();
    }

    public OnlinePaymentForm fillPaymentForm(String phone, String sum) {
        inputPhone(phone);
        inputSumPay(sum);
        clickButtonContinue();
        return this;

    }


}
