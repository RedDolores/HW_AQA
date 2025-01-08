package lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {
    public WebDriver driver;

    public HelpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class = 'pay__wrapper']/a[text() = 'Подробнее о сервисе']")
    private WebElement link;

    public String getUrlPage() {
        link.click();
        return this.driver.getCurrentUrl();
    }
}
