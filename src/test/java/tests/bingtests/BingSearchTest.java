package tests.bingtests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import pageobjects.bing.BingSearchPage;
import tests.Base;

public class BingSearchTest extends Base {
    private final BingSearchPage bingSearchPage = new BingSearchPage(driver);

    @Test
    public void searchBMWString() {
        openPage("https://www.bing.com/?cc=pl");
        closeCookiesBtn(bingSearchPage.closeCookiesBtn);
        bingSearchPage.enterValueToSearchInput("BMW");
        bingSearchPage.clickEnterInSearchInput();
        Assertions.assertEquals("BMW - Wyszukaj", driver.getTitle(), "Wyszukiwana fraza nie została poprawnie wyszukana w przegladarce bing.com");
    }

    @Test
    public void changeBackgroundWallpaper() {
        openPage("https://www.bing.com/?cc=pl");
        closeCookiesBtn(bingSearchPage.closeCookiesBtn);
        bingSearchPage.changeBackgroundWall();
    }

    @Test
    public void findMoreAboutBackgroundImage() {
        openPage("https://www.bing.com/?cc=pl");
        closeCookiesBtn(bingSearchPage.closeCookiesBtn);
        bingSearchPage.findOutMoreInfoAboutBackgroundImage();
    }

    @Test
    public void clickOnImagesSearch() {
        openPage("https://www.bing.com/?cc=pl");
        closeCookiesBtn(bingSearchPage.closeCookiesBtn);
        bingSearchPage.clickOnGraphicsLinkText();
    }

    @Test
    public void switchToEnglishVersion() {
        openPage("https://www.bing.com/?cc=pl");
        closeCookiesBtn(bingSearchPage.closeCookiesBtn);
        bingSearchPage.clickOnEnglishVersionLinkText();
    }

//    @Test
//    public void clickOnLogInLinkText() {
//        openPage("https://www.bing.com/?cc=pl");
//        closeCookiesBtn(bingSearchPage.closeCookiesBtn);
//        bingSearchPage.clickOnLogInLinkText();
//    }

    @Test
    public void clickOnVideoSearch() {
        openPage("https://www.bing.com/?cc=pl");
        closeCookiesBtn(bingSearchPage.closeCookiesBtn);
        bingSearchPage.clickOnVideoLinkText();
    }

    @Test
    public void switchToTranslator() {
        openPage("https://www.bing.com/?cc=pl");
        closeCookiesBtn(bingSearchPage.closeCookiesBtn);
        bingSearchPage.clickOnTranslateLinkText();
    }
}
