package tests.bingtests;

import org.junit.Test;
import pageobjects.bing.BingSearchPage;
import tests.Base;

public class BingSearchTest extends Base {
    private final BingSearchPage bingSearchPage = new BingSearchPage(driver);

    @Test
    public void searchRandomString() {
        openPage("https://www.bing.com/?cc=pl");
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.enterValueToSearchInput("BMW");
        bingSearchPage.clickEnterInSearchInput();
    }

    @Test
    public void changeBackgroundWallpaper() {
        openPage("https://www.bing.com/?cc=pl");
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.changeBackgroundWall();
    }

    @Test
    public void findMoreAboutBackgroundImage() {
        openPage("https://www.bing.com/?cc=pl");
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.findOutMoreInfoAboutBackgroundImage();
    }

    @Test
    public void clickOnImagesSearch() {
        openPage("https://www.bing.com/?cc=pl");
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.clickOnGraphicsLinkText();
    }

    @Test
    public void switchToEnglishVersion() {
        openPage("https://www.bing.com/?cc=pl");
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.clickOnEnglishVersionLinkText();
    }

    @Test
    public void clickOnLogInLinkText() {
        openPage("https://www.bing.com/?cc=pl");
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.clickOnLogInLinkText();
    }

    @Test
    public void clickOnVideoSearch() {
        openPage("https://www.bing.com/?cc=pl");
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.clickOnVideoLinkText();
    }

    @Test
    public void switchToTranslator() {
        openPage("https://www.bing.com/?cc=pl");
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.clickOnTranslateLinkText();
    }
}
