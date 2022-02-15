package testBases;

import google.GoogleMainPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBaseGoogle {
    WebDriver driver;
    WebDriverWait wait;
    String BASE_URL = "https://google.com";
    public GoogleMainPage googleMainPage;

    @Before
    public void setUP(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konrad\\IdeaProjects\\SelenuimCourse\\chromedriver");
        driver = new ChromeDriver();
        googleMainPage = PageFactory.initElements(driver, GoogleMainPage.class);
        driver.get(BASE_URL);
        googleMainPage.clcikOnSzukajWGoogle(wait);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
































































//
//public class TestBaseGoogle {
//    WebDriver driver;
//    WebDriverWait wait;
//    String BASE_URL = "https://google.com";
//    public GoogleMainPage googleMainPage;
//
//    @Before
//    public void setUP(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konrad\\IdeaProjects\\SelenuimCourse\\chromedriver");
//        driver = new ChromeDriver();
//        googleMainPage = PageFactory.initElements(driver, GoogleMainPage.class);
//        googleMainPage.makeElementsVisible(wait);
//        driver.get(BASE_URL);
//    }
//
//    @After
//    public void tearDown(){
//        driver.quit();
//    }
//
//}