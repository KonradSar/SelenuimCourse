package tests.googletests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import pageobjects.google.GoogleResultsPage;
import tests.Base;
import utils.variables.GlobalVariables;

public class GoogleResultsTest extends Base {

    private final GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);

    @Test
    public void clickOnGraphicsLinkText() {
        openPage(GlobalVariables.bmwGoogleResultsWebPage);
        closeCookiesBtn(googleResultsPage.closeCookiesBtn);
        googleResultsPage.clickOnGraphicsLinkText();
        Assertions.assertEquals("BMW - Szukaj w Google", driver.getTitle(), "Images search for google results does not work");
    }

    @Test
    public void switchToNextResultsPage() {
        openPage(GlobalVariables.bmwGoogleResultsWebPage);
        closeCookiesBtn(googleResultsPage.closeCookiesBtn);
        googleResultsPage.clickOnNextPageLinkText();

    }

}
