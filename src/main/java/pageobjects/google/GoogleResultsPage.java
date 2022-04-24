package pageobjects.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.PageObjects;

public class GoogleResultsPage extends PageObjects {

    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    //Web elements available on google results page below
    public final By closeCookiesBtn = By.cssSelector(".VDity button:nth-child(2)");
    private final By graphicsLinkText = By.cssSelector(".MUFPAc div:nth-child(2) a");
    private final By messagesLinkText = By.cssSelector(".MUFPAc div:nth-child(3) a");
    private final By shoppingsLinkText = By.cssSelector(".MUFPAc div:nth-child(4) a");
    private final By mapsLinkText = By.cssSelector(".MUFPAc div:nth-child(5) a");
    private final By toolsLinkText = By.cssSelector("#hdtb-tls");
    private final By nextPageLinkText = By.cssSelector(".BBwThe a span:nth-child(2)");


    //Additional methods for the whole page elements below
    public void clickOnGraphicsLinkText() {
        waitForElement(graphicsLinkText).click();
    }

    public void clickOnMessagesLinkText() {
        waitForElement(messagesLinkText).click();
    }

    public void clickOnShoppingsLinkText() {
        waitForElement(shoppingsLinkText).click();
    }

    public void clickOnMaps() {
        waitForElement(mapsLinkText).click();
    }

    public void clickOnToolsLinkText() {
        waitForElement(toolsLinkText).click();
    }

    public void clickOnNextPageLinkText() {
        waitForElement(nextPageLinkText).click();
    }
}
