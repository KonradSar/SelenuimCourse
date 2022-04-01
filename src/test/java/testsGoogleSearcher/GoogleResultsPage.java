package testsGoogleSearcher;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultsPage extends TestBasesGoogleResults{
    WebDriver driver;
    String BASE_URL = "https://www.google.com/search?q=bentley&sxsrf=APq-WBu5TU7zsMaoQvuGs24v0xvibCnF3g%3A1645545587459&source=hp&ei=cwgVYsXGGML67_UPz6yh-AQ&iflsig=AHkkrS4AAAAAYhUWg_ROoILmSsvXimSO90HmwzOi26Rm&oq=&gs_lcp=Cgdnd3Mtd2l6EAEYADIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzINCC4QxwEQrwEQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJ1AAWABguQloAXAAeACAAQCIAQCSAQCYAQCwAQo&sclient=gws-wiz";
    public GoogleResultsPage googleResultsPage;
    WebElement webElement;


    @Before
    public void setUP(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konrad\\IdeaProjects\\SelenuimCourse\\chromedriver");
        driver = new ChromeDriver();
        googleResultsPage = PageFactory.initElements(driver, GoogleResultsPage.class);
        driver.get(BASE_URL);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Override
    public void clickOnImages() {
        driver.findElement(By.cssSelector(".MUFPAc .hdtb-mitem > a[href$='QAw']")).click();

    }

    @Override
    public void closeAdditionalViews() {
        setUP();
        driver.findElement(By.cssSelector("#L2AGLb .QS5gu.sy4vM")).click();
    }

    @Override
    public void checkVideosListing() {
        driver.findElement(By.cssSelector("div.hdtb-mitem:nth-child(5) > a")).click();
    }

    @Override
    public void watchVideo() {
        driver.findElement(By.cssSelector("div.hdtb-mitem:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("a[href='https://www.youtube.com/watch?v=uhC65o-_uUU']")).click();
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
    }

    @Override
    public void rightClickOnImage() {
        setUP();
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#L2AGLb .QS5gu.sy4vM")).click();
        driver.findElement(By.cssSelector(".MUFPAc .hdtb-mitem > a[href$='QAw']")).click();
        webElement = driver.findElement(By.cssSelector(".PNCib:nth-child(5)"));
    }
}
