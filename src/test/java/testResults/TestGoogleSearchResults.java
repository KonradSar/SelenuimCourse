package testResults;

import org.junit.Test;
import testsGoogleSearcher.GoogleResultsPage;

public class TestGoogleSearchResults extends GoogleResultsPage {
    @Test
    public void clickOnImagesLink(){
        googleResultsPage.closeAdditionalViews();
        googleResultsPage.clickOnImages();
    }

    @Test
    public void checkGoogleVideos(){
        googleResultsPage.closeAdditionalViews();
        googleResultsPage.checkVideosListing();
    }

    @Test
    public void watchYTVideo(){
        googleResultsPage.closeAdditionalViews();
        googleResultsPage.watchVideo();
    }

    @Test
    public void downloadImages(){
        googleResultsPage.rightClickOnImage();
    }
}
