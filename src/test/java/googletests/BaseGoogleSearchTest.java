package googletests;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseGoogleSearchTest {
    public static WebDriver driver;
    public static String BASE_URL = "https://google.pl";

    @BeforeClass
    public static void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konrad\\IdeaProjects\\SelenuimCourse\\chromedriver");
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}