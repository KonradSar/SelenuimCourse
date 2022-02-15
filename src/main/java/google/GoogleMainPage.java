package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleMainPage {
    @FindBy(linkText = "Szukaj w Google")
    WebElement searchBtn;

    public void clcikOnSzukajWGoogle(WebDriverWait webDriverWait){
        searchBtn = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Szukaj w Google")));
        searchBtn = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Szukaj w Google")));
        searchBtn.click();

    }

    public void searchForText(String text){
        searchBtn.sendKeys(text);
        searchBtn.submit();
    }
}









































//public class GoogleMainPage {
//    @FindBy(name = "q")
//    WebElement searchInput;
//
//    public void makeElementsVisible(WebDriverWait webDriverWait){
//        searchInput = webDriverWait.until(ExpectedConditions.visibilityOf(searchInput));
//        searchInput = webDriverWait.until(ExpectedConditions.elementToBeClickable(searchInput));
//
//    }
//
//    public void searchForText(String text){
//        searchInput.sendKeys(text);
//        searchInput.submit();
//    }
//}