package pageobjects.bing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageobjects.PageObjects;

public class BingSearchPage extends PageObjects {

    public BingSearchPage(WebDriver driver) {
        super(driver);
    }

    //Web elements available on bing main page below
    public final By closeCookiesBtn = By.cssSelector("#bnp_btn_accept");
    private final By searchInput = By.cssSelector(".sbox #sb_form_q");
    private final By graphicsLinkText = By.cssSelector("#images a");
    private final By englishVerLinkText = By.cssSelector(".sw_mktsw a");
    private final By logInLinkText = By.cssSelector("#id_l #id_s");
    private final By videoLinkText = By.cssSelector("li.scope:nth-child(2) a");
    private final By translateLinkText = By.cssSelector("li.scope:nth-child(3) a");
    private final By changeBackgroundArrowLeft = By.cssSelector(".nav #leftNav");
    private final By moreInfoAboutBackgroundImage = By.cssSelector(".icon_text");


    //Main methods for entering and searching any content in bing below
    public void enterValueToSearchInput(String text) {
        waitForElement(searchInput).sendKeys(text);
    }

    public void clickEnterInSearchInput() {
        waitForElement(searchInput).sendKeys(Keys.ENTER);
    }

    public void changeBackgroundWall() {
        waitForElement(changeBackgroundArrowLeft).click();
    }

    public void findOutMoreInfoAboutBackgroundImage() {
        waitForElement(moreInfoAboutBackgroundImage).click();
    }

    //Additional methods for the whole page elements below
    public void clickOnGraphicsLinkText() {
        waitForElement(graphicsLinkText).click();
    }

    public void clickOnEnglishVersionLinkText() {
        waitForElement(englishVerLinkText).click();
    }

    public void clickOnLogInLinkText() {
        waitForElement(logInLinkText).click();
    }

    public void clickOnVideoLinkText() {
        waitForElement(videoLinkText).click();
    }

    public void clickOnTranslateLinkText() {
        waitForElement(translateLinkText).click();
    }
}
