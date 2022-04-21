package pageobjects.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import pageobjects.PageObjects;


public class GoogleSearchPage extends PageObjects {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);

    }

    //Web elements available on google main page below
    private final By searchInput = By.cssSelector(".gLFyf.gsfi");
    public final By closeCookiesBtn = By.cssSelector("#L2AGLb .QS5gu.sy4vM");
    private final By luckyBtn = By.cssSelector(".FPdoLc .RNmpXc");
    private final By graphicsLinkText = By.cssSelector(".gb_e:nth-child(2)");
    private final By gmailLinkText = By.cssSelector(".gb_e:nth-child(1)");
    private final By aboutUsLinkText = By.cssSelector(".AghGtd a:nth-child(1)");
    private final By advertiseYourselfLinkText = By.cssSelector(".AghGtd a:nth-child(2)");
    private final By forCompaniesLinkText = By.cssSelector(".AghGtd a:nth-child(3)");
    private final By howDoesTheWebBrowserWorkLinkText = By.cssSelector(".AghGtd a:nth-child(4)");
    private final By privacyLinkText = By.cssSelector(".iTjxkf a:nth-child(1)");
    private final By conditionsLinkText = By.cssSelector(".iTjxkf a:nth-child(2)");
    private final By settingsLinkText = By.cssSelector("#Mses6b");
    private final By COneutrality2007adLinkText = By.cssSelector(".ssOUyb a:nth-child(1)");


    //Main methods for entering and searching any content in google below
    public void enterValueToSearchInput(String text) {
        waitForElement(searchInput).sendKeys(text);
    }

    public void clickEnterInSearchInput() {
        waitForElement(searchInput).sendKeys(Keys.ENTER);
    }

    public void clickOnLuckyBtn() {
        waitForElement(luckyBtn).click();
    }

    //Additional methods for exploring gmail and graphics below
    public void clickOnGmailBtn() {
        waitForElement(gmailLinkText).click();
    }

    public void clickOnGraphics() {
        waitForElement(graphicsLinkText).click();
    }

    //Additional methods for bottom of the google page below
    public void clickOnCO2neutralityLinkText() {
        waitForElement(COneutrality2007adLinkText).click();
    }

    public void clickOnAboutUsLinkText() {
        waitForElement(aboutUsLinkText).click();
    }

    public void clickOnAdvertiseYourselfLinkText() {
        waitForElement(advertiseYourselfLinkText).click();
    }

    public void clickOnForCompaniesLinkText() {
        waitForElement(forCompaniesLinkText).click();
    }

    public void clickOnHowDoesTheSearcherWorkLinkText() {
        waitForElement(howDoesTheWebBrowserWorkLinkText).click();
    }

    public void clickOnPrivacyLinkText() {
        waitForElement(privacyLinkText).click();
    }

    public void clickOnConditionsLinkText() {
        waitForElement(conditionsLinkText).click();
    }

//    public void clickOnSettingsLinkText() {
//        settingsLinkText.click();
//    }
}

