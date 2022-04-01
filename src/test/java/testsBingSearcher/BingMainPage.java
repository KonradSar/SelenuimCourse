package testsBingSearcher;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BingMainPage extends TestBasesBingMainPage {
    WebDriver driver;
    String BASE_URL = "https://bing.com";
    public BingMainPage testBaseBing;

    @Before
    public void setUP(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konrad\\IdeaProjects\\SelenuimCourse\\chromedriver");
        driver = new ChromeDriver();
        testBaseBing = PageFactory.initElements(driver, BingMainPage.class);
        driver.get(BASE_URL);
    }

    @After
    public void tearDown(){
        driver.quit();
    }


    @Override
    public void searchInTheBrowser(String phrase) {
        setUP();
        //maximalizing view
        driver.manage().window().maximize();
        //forwarding phrase to searcher and ciclk on Enter
        driver.findElement(By.cssSelector("#sb_form > #sb_form_q")).sendKeys(phrase);
        driver.findElement(By.cssSelector("#sb_form > #sb_form_q")).sendKeys(Keys.RETURN);

    }

    @Override
    public void switchToEnglish() {
        setUP();
        driver.manage().window().maximize();
        //click on English link
        driver.findElement(By.cssSelector("#idCont > span")).click();
    }

    @Override
    public void searchForImages(String phrase) {
        setUP();
        driver.manage().window().maximize();
        //switching into Images search
        driver.findElement(By.cssSelector("#images > a")).click();
        //forwarding phrase to searcher
        driver.findElement(By.cssSelector("#sb_form > #sb_form_q")).sendKeys(phrase);
        driver.findElement(By.cssSelector("#sb_form > #sb_form_q")).sendKeys(Keys.RETURN);

    }

}
