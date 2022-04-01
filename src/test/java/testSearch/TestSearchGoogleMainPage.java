package testSearch;

import org.junit.Test;
import testsGoogleSearcher.GoogleMainPage;

public class TestSearchGoogleMainPage extends GoogleMainPage {
//    @Test
//    public void lookForAnyPhraseInGoogleSearcher(){
//        testBaseGoogle.closeAdditionalViews();
//        testBaseGoogle.searchInTheBrowser("Bentley");
//
//    }
//    @Test
//    public void clickOnImagesOmMainGooglePage(){
//        testBaseGoogle.closeAdditionalViews();
//        testBaseGoogle.clickOnImages();
//
//    }
//    @Test
//    public void clickOnImagesOmMainGooglePage(){
//        testBaseGoogle.closeAdditionalViews();
//        testBaseGoogle.searchRandomString();
//
//    }
    @Test
    public void clickOnImagesOmMainGooglePage(){
        testBaseGoogle.closeAdditionalViews();
        testBaseGoogle.searchRandomString();

    }


}
