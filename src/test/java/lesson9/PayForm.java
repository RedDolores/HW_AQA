package lesson9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayForm {
    public WebDriver driver;

    public PayForm(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//iframe[@class = 'bepaid-iframe']")
    WebElement payWindow;

    @FindBy(xpath = "//span[text() = '100.00 BYN']")
    WebElement titleSum;

    @FindBy(xpath = "//span[contains(text(), 'Номер')]")
    WebElement titlePhone;

    @FindBy(xpath = "//label[text() = 'Номер карты']")
    WebElement placeholderCreditCard;

    @FindBy(xpath = "//label[text() = 'Срок действия']")
    WebElement placeholderExpirationDate;

    @FindBy(xpath = "//label[text() = 'CVC']")
    WebElement placeholderCVC;

    @FindBy(xpath = "//label[text() = 'Имя держателя (как на карте)']")
    WebElement placeholderCardHolder;

    @FindBy(xpath = "//button[@class = 'colored disabled']")
    WebElement buttonSubmit;

    @FindBy(xpath = "//img[@src = 'assets/images/payment-icons/card-types/visa-system.svg']")
    WebElement iconVisaSystem;

    @FindBy(xpath = "//img[@src = 'assets/images/payment-icons/card-types/mastercard-system.svg']")
    WebElement iconMastercardSystem;

    @FindBy(xpath = "//img[@src = 'assets/images/payment-icons/card-types/belkart-system.svg']")
    WebElement iconBelkartSystem;

    @FindBy(xpath = "//img[@src = 'assets/images/payment-icons/card-types/maestro-system.svg']")
    WebElement iconMaestroSystem;

    @FindBy(xpath = "//img[@src = 'assets/images/payment-icons/card-types/mir-system-ru.svg']")
    WebElement iconMirSystemRu;

    public WebElement getPayWindow() {
        return payWindow;
    }

    public String getTitleSum() {
        return titleSum.getText();
    }

    public String getTitlePhone() {
        return titlePhone.getText();
    }

    public String getPlaceholderCreditCard() {
        return placeholderCreditCard.getText();
    }

    public String getPlaceholderExpirationDate() {
        return placeholderExpirationDate.getText();
    }

    public String getPlaceholderCVC() {
        return placeholderCVC.getText();
    }

    public String getPlaceholderCardHolder() {
        return placeholderCardHolder.getText();
    }

    public String getTitleButtonSubmit() {
        return buttonSubmit.getText();
    }

    public String getIconVisaSystem() {
        return iconVisaSystem.getAttribute("src");
    }

    public String getIconMastercardSystem() {
        return iconMastercardSystem.getAttribute("src");
    }

    public String getIconBelkartSystem() {
        return iconBelkartSystem.getAttribute("src");
    }

    public String getIconMaestroSystem() {
        return iconMaestroSystem.getAttribute("src");
    }

    public String getIconMirSystemRu() {
        return iconMirSystemRu.getAttribute("src");
    }


    public boolean payFormIsDisplayed() {
        return payWindow.isDisplayed();
    }
}
