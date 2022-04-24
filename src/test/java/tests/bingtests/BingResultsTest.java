package tests.bingtests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import pageobjects.bing.BingResultsPage;
import tests.Base;
import utils.variables.GlobalVariables;

public class BingResultsTest extends Base {
    private final BingResultsPage bingResultsPage = new BingResultsPage(driver);

    @Test
    public void clickOnGraphicsLinkText() {
        openPage(GlobalVariables.bmwBingResultsWebPage);
        closeCookiesBtn(bingResultsPage.closeCookiesBtn);
        bingResultsPage.clickOnImagesLinkText();
        Assertions.assertEquals("bmw - Bing images", driver.getTitle(), "Kliknięcie na wyniki wyszukiwania w formie grafiki nie działają");
    }

    @Test
    public void clickOnVideosLinkText() {
        openPage(GlobalVariables.bmwBingResultsWebPage);
        closeCookiesBtn(bingResultsPage.closeCookiesBtn);
        bingResultsPage.clickOnVideoLinkText();
        Assertions.assertEquals("bmw - Bing video", driver.getTitle(), "Kliknięcie na wyniki wyszukiwania w formie video nie działają");
    }

    @Test
    public void clickOnMapsLinkText() {
        openPage(GlobalVariables.bmwBingResultsWebPage);
        closeCookiesBtn(bingResultsPage.closeCookiesBtn);
        bingResultsPage.clickOnMapsLinkText();
        Assertions.assertEquals("bmw - Bing Mapy", driver.getTitle(), "Kliknięcie na wyniki wyszukiwania w formie Mapy nie działają");
    }

    @Test
    public void clickOnMessagesLinkText() {
        openPage(GlobalVariables.bmwBingResultsWebPage);
        closeCookiesBtn(bingResultsPage.closeCookiesBtn);
        bingResultsPage.clickOnMessagesLinkText();
        Assertions.assertEquals("bmw - Bing News", driver.getTitle(), "Kliknięcie na wyniki wyszukiwania w formie wiadomości nie działają");
    }

    @Test
    public void clickOnNextPageArrow() {
        openPage(GlobalVariables.bmwBingResultsWebPage);
        closeCookiesBtn(bingResultsPage.closeCookiesBtn);
        bingResultsPage.clickOnNextPageArrow();
    }
}
