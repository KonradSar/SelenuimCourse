package googletests;

import org.junit.Test;
import pageobjects.google.GoogleResultsPage;

public class GoogleResultsTest extends BaseGoogleResultsTest {

    private final GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);

    @Test
    public void clickOnGraphicsLinkText() {
        googleResultsPage.closeCookiesPopup();
        googleResultsPage.clickOnGraphicsLinkText();
    }

    @Test
    public void switchToNextResultsPage(){
        googleResultsPage.closeCookiesPopup();
        googleResultsPage.clickOnNextPageLinkText();

    }

}

// co nam daje beforeclass, po co ten pageObjects klasa, czy w utils mogę dodawać zmienne sobie?
// co jakbym chciał teraz wyniki w google dodac do tablicy stringow i poiterować po niej i ja jakiś element ma w nazwie wikipedia to kliknąc w ten link