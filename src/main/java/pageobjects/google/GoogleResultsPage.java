package pageobjects.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.PageObjects;

public class GoogleResultsPage extends PageObjects {

    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    //Web elements available on google results page below
    private final WebElement closeCookiesBtn = driver.findElement(By.cssSelector(".VDity button:nth-child(2)"));
    private final WebElement graphicsLinkText = driver.findElement(By.cssSelector(".MUFPAc div:nth-child(2) a"));
    private final WebElement messagesLinkText = driver.findElement(By.cssSelector(".MUFPAc div:nth-child(3) a"));
    private final WebElement shoppingsLinkText = driver.findElement(By.cssSelector(".MUFPAc div:nth-child(4) a"));
    private final WebElement mapsLinkText = driver.findElement(By.cssSelector(".MUFPAc div:nth-child(5) a"));
    private final WebElement toolsLinkText = driver.findElement(By.cssSelector("#hdtb-tls"));
    private final WebElement nextPageLinkText = driver.findElement(By.cssSelector(".BBwThe a span:nth-child(2)"));



    //Method which closes cookies popup below
    public void closeCookiesPopup() {
        closeCookiesBtn.click();
    }

    //Additional methods for the whole page elements below
    public void clickOnGraphicsLinkText(){
        graphicsLinkText.click();
    }
    public void clickOnMessagesLinkText(){
        messagesLinkText.click();
    }
    public void clickOnShoppingsLinkText(){
        shoppingsLinkText.click();
    }
    public void clickOnMaps(){
        mapsLinkText.click();
    }
    public void clickOnToolsLinkText(){
        toolsLinkText.click();
    }
    public void clickOnNextPageLinkText(){
        nextPageLinkText.click();
    }
}
