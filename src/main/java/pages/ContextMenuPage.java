package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;

import java.awt.event.MouseAdapter;

public class ContextMenuPage {
    private WebDriver driver;
    private By boxSpot  = By.id("hot-spot");
    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickOnTheBox(){
        WebElement box = driver.findElement(boxSpot);
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

}
