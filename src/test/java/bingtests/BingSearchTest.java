package bingtests;

import org.junit.Test;
import pageobjects.bing.BingSearchPage;

public class BingSearchTest extends BaseBingSearchTest {
    private final BingSearchPage bingSearchPage = new BingSearchPage(driver);

    @Test
    public void searchRandomString() {
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.enterValueToSearchInput("BMW");
        bingSearchPage.clickEnterInSearchInput();
    }

    @Test
    public void changeBackgroundWallpaper() {
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.changeBackgroundWall();
    }

    @Test
    public void findMoreAboutBackgroundImage() {
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.findOutMoreInfoAboutBackgroundImage();
    }

    @Test
    public void clickOnImagesSearch() {
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.clickOnGraphicsLinkText();
    }

    @Test
    public void switchToEnglishVersion() {
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.clickOnEnglishVersionLinkText();
    }

    @Test
    public void clickOnLogInLinkText() {
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.clickOnLogInLinkText();
    }

    @Test
    public void clickOnVideoSearch() {
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.clickOnVideoLinkText();
    }

    @Test
    public void switchToTranslator() {
        bingSearchPage.closeCookiesPopup();
        bingSearchPage.clickOnTranslateLinkText();
    }
}
