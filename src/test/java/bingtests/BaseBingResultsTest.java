package bingtests;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseBingResultsTest {
    public static WebDriver driver;
    public static String BASE_URL = "https://www.bing.com/search?q=bmw&form=QBLH&sp=-1&pq=bmw&sc=8-3&qs=n&sk=&cvid=DD26A9D928E3455D92D62E5C73437271";

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
