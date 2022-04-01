package testSearch;

import org.junit.Test;
import testsBingSearcher.BingMainPage;

public class TestSearchBingMainPage extends BingMainPage {
    @Test
    public void searchPhraseOnBing(){
        testBaseBing.searchInTheBrowser("BMW");
    }
    @Test
    public void switchLanguageIntoEnglish(){
        testBaseBing.switchToEnglish();
    }
    @Test
    public void searchEnglishImagesResults(){
        testBaseBing.searchForImages("lower front ball joint lemforder w212");
    }
}
