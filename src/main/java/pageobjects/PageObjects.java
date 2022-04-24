package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjects {
    protected WebDriver driver;

    public PageObjects(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(driver, this);
    }

    public WebElement waitForElement(By by) {
        WebDriverWait wait = (new WebDriverWait(driver, 10));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }
}
