package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //Exercise Chapter 3
        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();

        WebElement exampleOneLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        exampleOneLink.click();

        List<WebElement> menuElement = driver.findElements(By.tagName("li"));
        System.out.println("Menu Element Size: " + menuElement.size());

        WebElement homeLink = driver.findElement(By.linkText("Home"));
        homeLink.click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Home Link Size: " + links.size());

        WebElement checkboxesLink = driver.findElement(By.linkText("Checkboxes"));
        checkboxesLink.click();

        System.out.println(driver.getTitle());


    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
