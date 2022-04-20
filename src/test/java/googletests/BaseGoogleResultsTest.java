package googletests;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseGoogleResultsTest {
    public static WebDriver driver;
    public static String BASE_URL = "https://www.google.pl/search?q=BMW&source=hp&ei=-59JYtneAZjukgWomoqIAg&iflsig=AHkkrS4AAAAAYkmuC_o1nmnmoej1t8UJ9ikmBNdItkPa&ved=0ahUKEwiZyPDq_vf2AhUYt6QKHSiNAiEQ4dUDCAc&uact=5&oq=BMW&gs_lcp=Cgdnd3Mtd2l6EAMyEQguEIAEELEDEIMBEMcBEKMCMgsIABCABBCxAxCDATIICAAQgAQQsQMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIICAAQgAQQsQMyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBOgsILhCABBCxAxCDAToICC4QsQMQgwE6CwguELEDEIMBENQCOhEILhCABBCxAxCDARDHARDRAzoICAAQsQMQgwFQAFjVA2DiBmgAcAB4AIABgAKIAbYEkgEFMC4xLjKYAQCgAQE&sclient=gws-wiz";

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
