package pageobjects.bing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import pageobjects.PageObjects;

public class BingResultsPage extends PageObjects {
    public BingResultsPage(WebDriver driver) {
        super(driver);
    }

    //Web elements available on bing results page below
    private final By imagesLinkText = By.cssSelector("#b-scopeListItem-images a");
    private final By videoLinkText = By.cssSelector("#b-scopeListItem-video a");
    private final By mapsLinkText = By.cssSelector("#b-scopeListItem-local a");
    private final By messagesLinkText = By.cssSelector("#b-scopeListItem-news a");
    private final By nextPageArrow = By.cssSelector(".sb_pagF .sb_pagN");
    private final By closeCookiesBtn = By.cssSelector(".bnp_action_container .bnp_btn_accept");

    //Method which closes cookies popup below
    public void closeCookiesPopup() {
        waitForElement(closeCookiesBtn).click();
    }

    //Main methods for testing bing results below
    public void clickOnImagesLinkText() {
        waitForElement(imagesLinkText).click();
    }

    public void clickOnVideoLinkText() {
        waitForElement(videoLinkText).click();
    }

    public void clickOnMapsLinkText() {waitForElement(mapsLinkText).click();}

    public void clickOnMessagesLinkText() {waitForElement(messagesLinkText).click();}

    public void clickOnNextPageArrow() {waitForElement(nextPageArrow).click();}

}
