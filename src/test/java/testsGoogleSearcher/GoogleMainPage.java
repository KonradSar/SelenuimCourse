package testsGoogleSearcher;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class GoogleMainPage extends TestBasesGoogleMainPage {
    WebDriver driver;
    String BASE_URL = "https://google.pl";
    public GoogleMainPage testBaseGoogle;
    StringBuilder stringBuilder;
    Random random;

    @Before
    public void setUP(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konrad\\IdeaProjects\\SelenuimCourse\\chromedriver");
        driver = new ChromeDriver();
        testBaseGoogle = PageFactory.initElements(driver, GoogleMainPage.class);
        driver.get(BASE_URL);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Override
    public void searchInTheBrowser(String phrase) {
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(phrase);
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);
        driver.manage().window().maximize();

    }

    @Override
    public void searchRandomString() {
        //generating a 5 elements random String consisted of charArray letters
        char[] charArray = "abcdefghijklłmnoprstuwxyz".toCharArray();
        stringBuilder = new StringBuilder(5);
        random = new Random();
        for (int i = 0; i < 5; i++){
            char phraseForGoogleSearcher = charArray[random.nextInt(charArray.length)];
            stringBuilder.append(phraseForGoogleSearcher);

        }
        //String value passed to variable and typed in google searcher
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(stringBuilder.toString());
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);
    }

    @Override
    public void clickOnImages() {
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".gb_e  > a[href='https://www.google.pl/imghp?hl=pl&ogbl']")).click();
    }

    @Override
    public void closeAdditionalViews() {
        setUP();
        driver.findElement(By.cssSelector("#L2AGLb .QS5gu.sy4vM")).click();
    }

}