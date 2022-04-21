package tests.bingtests;

import org.junit.Test;
import pageobjects.bing.BingResultsPage;
import tests.Base;

public class BingResultsTest  extends Base {
    private final BingResultsPage bingResultsPage = new BingResultsPage(driver);

    @Test
    public void clickOnGraphicsLinkText() {
        openPage("https://www.bing.com/search?q=bmw&form=QBLH&sp=-1&pq=bmw&sc=8-3&qs=n&sk=&cvid=DD26A9D928E3455D92D62E5C73437271");
        bingResultsPage.closeCookiesPopup();
        bingResultsPage.clickOnImagesLinkText();
    }

    @Test
    public void clickOnVideosLinkText(){
        openPage("https://www.bing.com/search?q=bmw&form=QBLH&sp=-1&pq=bmw&sc=8-3&qs=n&sk=&cvid=DD26A9D928E3455D92D62E5C73437271");
        bingResultsPage.closeCookiesPopup();
        bingResultsPage.clickOnVideoLinkText();
    }
    @Test
    public void clickOnMapsLinkText(){
        openPage("https://www.bing.com/search?q=bmw&form=QBLH&sp=-1&pq=bmw&sc=8-3&qs=n&sk=&cvid=DD26A9D928E3455D92D62E5C73437271");
        bingResultsPage.closeCookiesPopup();
        bingResultsPage.clickOnMapsLinkText();
    }
    @Test
    public void clickOnMessagesLinkText(){
        openPage("https://www.bing.com/search?q=bmw&form=QBLH&sp=-1&pq=bmw&sc=8-3&qs=n&sk=&cvid=DD26A9D928E3455D92D62E5C73437271");
        bingResultsPage.closeCookiesPopup();
        bingResultsPage.clickOnMessagesLinkText();
    }
    @Test
    public void clickOnNextPageArrow(){
        openPage("https://www.bing.com/search?q=bmw&form=QBLH&sp=-1&pq=bmw&sc=8-3&qs=n&sk=&cvid=DD26A9D928E3455D92D62E5C73437271");
        bingResultsPage.closeCookiesPopup();
        bingResultsPage.clickOnNextPageArrow();
    }
}
