package pageobjects.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.PageObjects;


public class GoogleSearchPage extends PageObjects {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);

    }

    //Web elements available on google main page below
    private final WebElement searchInput = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
    private final WebElement closeCookiesBtn = driver.findElement(By.cssSelector("#L2AGLb .QS5gu.sy4vM"));
    private final WebElement luckyBtn = driver.findElement(By.cssSelector(".FPdoLc .RNmpXc"));
    private final WebElement graphicsLinkText = driver.findElement(By.cssSelector(".gb_e:nth-child(2)"));
    private final WebElement gmailLinkText = driver.findElement(By.cssSelector(".gb_e:nth-child(1)"));
    private final WebElement aboutUsLinkText = driver.findElement(By.cssSelector(".AghGtd a:nth-child(1)"));
    private final WebElement advertiseYourselfLinkText = driver.findElement(By.cssSelector(".AghGtd a:nth-child(2)"));
    private final WebElement forCompaniesLinkText = driver.findElement(By.cssSelector(".AghGtd a:nth-child(3)"));
    private final WebElement howDoesTheWebBrowserWorkLinkText = driver.findElement(By.cssSelector(".AghGtd a:nth-child(4)"));
    private final WebElement privacyLinkText = driver.findElement(By.cssSelector(".iTjxkf a:nth-child(1)"));
    private final WebElement conditionsLinkText = driver.findElement(By.cssSelector(".iTjxkf a:nth-child(2)"));
    private final WebElement settingsLinkText = driver.findElement(By.cssSelector("#Mses6b"));
    private final WebElement COneutrality2007adLinkText = driver.findElement(By.cssSelector(".ssOUyb a:nth-child(1)"));


    //Method which closes cookies popup below
    public void closeCookiesPopup() {
        closeCookiesBtn.click();
    }

    //Main methods for entering and searching any content in google below
    public void enterValueToSearchInput(String text) {
        searchInput.sendKeys(text);
    }

    public void clickEnterInSearchInput() {
        searchInput.sendKeys(Keys.ENTER);
    }

    public void clickOnLuckyBtn() {
        luckyBtn.click();
    }

    //Additional methods for exploring gmail and graphics below
    public void clickOnGmailBtn() {
        gmailLinkText.click();
    }

    public void clickOnGraphics() {
        graphicsLinkText.click();
    }

    //Additional methods for bottom of the google page below
    public void clickOnCO2neutralityLinkText() {
        COneutrality2007adLinkText.click();
    }

    public void clickOnAboutUsLinkText() {
        aboutUsLinkText.click();
    }

    public void clickOnAdvertiseYourselfLinkText() {
        advertiseYourselfLinkText.click();
    }

    public void clickOnForCompaniesLinkText() {
        forCompaniesLinkText.click();
    }

    public void clickOnHowDoesTheSearcherWorkLinkText() {
        howDoesTheWebBrowserWorkLinkText.click();
    }

    public void clickOnPrivacyLinkText() {
        privacyLinkText.click();
    }

    public void clickOnConditionsLinkText() {
        conditionsLinkText.click();
    }

    public void clickOnSettingsLinkText() {
        settingsLinkText.click();
    }
}

