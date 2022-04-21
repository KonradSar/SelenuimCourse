package tests.googletests;

import org.junit.Test;
import pageobjects.google.GoogleSearchPage;
import tests.Base;

import static utils.StringGenerator.generateRandomString;

public class GoogleSearchTest extends Base {

    private final GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

    @Test
    public void searchRandomString() {
        openPage("https://google.pl");
        closeCookiesBtn(googleSearchPage.closeCookiesBtn);
        googleSearchPage.enterValueToSearchInput(generateRandomString(5));
        googleSearchPage.clickEnterInSearchInput();
    }

}
