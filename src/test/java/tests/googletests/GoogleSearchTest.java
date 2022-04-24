package tests.googletests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import pageobjects.google.GoogleSearchPage;
import tests.Base;
import utils.variables.GlobalVariables;

import static utils.methods.StringGenerator.generateRandomString;

public class GoogleSearchTest extends Base {

    private final GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

    @Test
    public void searchRandomString() {
        openPage("https://google.pl");
        closeCookiesBtn(googleSearchPage.closeCookiesBtn);
        googleSearchPage.enterValueToSearchInput(generateRandomString(5));
        googleSearchPage.clickEnterInSearchInput();
        Assertions.assertEquals(GlobalVariables.stringValue, driver.getTitle(), "Random String google search does not work");
    }
    
    @Test
    public void searchAudiRS6String(){
        openPage("https://google.pl");
        closeCookiesBtn(googleSearchPage.closeCookiesBtn);
        googleSearchPage.enterValueToSearchInput("AudiRS6");
        googleSearchPage.clickEnterInSearchInput();
        Assertions.assertEquals("AudiRS6 - Szukaj w Google", driver.getTitle(), "AudiRS6 String google search does not work");
    }

}
