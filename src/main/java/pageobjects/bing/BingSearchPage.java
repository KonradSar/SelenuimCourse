package pageobjects.bing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.PageObjects;

public class BingSearchPage extends PageObjects {

    public BingSearchPage(WebDriver driver) {
        super(driver);
    }

    //Web elements available on bing main page below
    private final WebElement closeCookiesBtn = driver.findElement(By.cssSelector("#closeCookiesBtn"));
    private final WebElement searchInput = driver.findElement(By.cssSelector(".sbox #sb_form_q"));
    private final WebElement graphicsLinkText = driver.findElement(By.cssSelector("#images a"));
    private final WebElement englishVerLinkText = driver.findElement(By.cssSelector(".sw_mktsw a"));
    private final WebElement logInLinkText = driver.findElement(By.cssSelector("#id_l #id_s"));
    private final WebElement videoLinkText = driver.findElement(By.cssSelector("li.scope:nth-child(2) a"));
    private final WebElement translateLinkText = driver.findElement(By.cssSelector("li.scope:nth-child(3) a"));
    private final WebElement changeBackgroundArrowLeft = driver.findElement(By.cssSelector(".nav #leftNav"));
    private final WebElement moreInfoAboutBackgroundImage = driver.findElement(By.cssSelector(".icon_text"));

    //Method which closes cookies popup below
    public void closeCookiesPopup() {
        closeCookiesBtn.click();
    }

    //Main methods for entering and searching any content in bing below
    public void enterValueToSearchInput(String text) {
        searchInput.sendKeys(text);
    }

    public void clickEnterInSearchInput() {
        searchInput.sendKeys(Keys.ENTER);
    }

    public void changeBackgroundWall(){
        changeBackgroundArrowLeft.click();
    }

    public void findOutMoreInfoAboutBackgroundImage(){
        moreInfoAboutBackgroundImage.click();
    }

    //Additional methods for the whole page elements below
    public void clickOnGraphicsLinkText() {graphicsLinkText.click();}

    public void clickOnEnglishVersionLinkText() {englishVerLinkText.click();}

    public void clickOnLogInLinkText() {logInLinkText.click();}

    public void clickOnVideoLinkText() {videoLinkText.click();}

    public void clickOnTranslateLinkText() {translateLinkText.click();}
}
