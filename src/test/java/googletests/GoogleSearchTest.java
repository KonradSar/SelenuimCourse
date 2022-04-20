package googletests;

import org.junit.Test;
import pageobjects.google.GoogleSearchPage;

import static utils.StringGenerator.generateRandomString;

public class GoogleSearchTest extends BaseGoogleSearchTest {

    private final GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

    @Test
    public void searchRandomString() {
        googleSearchPage.closeCookiesPopup();
        googleSearchPage.enterValueToSearchInput(generateRandomString(5));
        googleSearchPage.clickEnterInSearchInput();

    }

}
