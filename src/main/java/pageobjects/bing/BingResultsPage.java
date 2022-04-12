package pageobjects.bing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.PageObjects;

public class BingResultsPage extends PageObjects {
    public BingResultsPage(WebDriver driver) {
        super(driver);
    }

    //Web elements available on bing results page below
    private final WebElement imagesLinkText = driver.findElement(By.cssSelector("#b-scopeListItem-images a"));
    private final WebElement videoLinkText = driver.findElement(By.cssSelector("#b-scopeListItem-video a"));
    private final WebElement mapsLinkText = driver.findElement(By.cssSelector("#b-scopeListItem-local a"));
    private final WebElement messagesLinkText = driver.findElement(By.cssSelector("#b-scopeListItem-news a"));
    private final WebElement nextPageArrow = driver.findElement(By.cssSelector(".sb_pagF .sb_pagN"));
    private final WebElement closeCookiesBtn = driver.findElement(By.cssSelector(".bnp_action_container .bnp_btn_accept"));

    //Method which closes cookies popup below
    public void closeCookiesPopup() {
        closeCookiesBtn.click();
    }

    //Main methods for testing bing results below
    public void clickOnImagesLinkText() {
        imagesLinkText.click();
    }

    public void clickOnVideoLinkText() {
        videoLinkText.click();
    }

    public void clickOnMapsLinkText() {mapsLinkText.click();}

    public void clickOnMessagesLinkText() {messagesLinkText.click();}

    public void clickOnNextPageArrow() {nextPageArrow.click();}

}
