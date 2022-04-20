package bingtests;

import org.junit.Test;
import pageobjects.bing.BingResultsPage;

public class BingResultsTest  extends BaseBingResultsTest{
    private final BingResultsPage bingResultsPage = new BingResultsPage(driver);

    @Test
    public void clickOnGraphicsLinkText() {
        bingResultsPage.closeCookiesPopup();
        bingResultsPage.clickOnImagesLinkText();
    }

    @Test
    public void clickOnVideosLinkText(){
        bingResultsPage.closeCookiesPopup();
        bingResultsPage.clickOnVideoLinkText();
    }
    @Test
    public void clickOnMapsLinkText(){
        bingResultsPage.closeCookiesPopup();
        bingResultsPage.clickOnMapsLinkText();
    }
    @Test
    public void clickOnMessagesLinkText(){
        bingResultsPage.closeCookiesPopup();
        bingResultsPage.clickOnMessagesLinkText();
    }
    @Test
    public void clickOnNextPageArrow(){
        bingResultsPage.closeCookiesPopup();
        bingResultsPage.clickOnNextPageArrow();
    }
}
