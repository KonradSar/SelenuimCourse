package tests;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;

    @BeforeClass
    public static void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Konrad\\IdeaProjects\\SelenuimCourse\\src\\main\\resources\\chromedriver");
        driver = new ChromeDriver();
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }

    protected void openPage(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    protected void closeCookiesBtn(By by) {
        try {
            WebElement element = driver.findElement(by);
            if (element.isDisplayed()) {
                element.click();
            }
        } catch (Exception e) {
            System.out.println("there's no such cookies popup to close so it will be skipped");
        }

    }
}
