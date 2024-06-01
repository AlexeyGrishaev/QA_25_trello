package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperBase {
    WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }
    private WebElement findElementBase(By locator){return driver.findElement(locator);}


    public void typeBase(By locator, String text){
        WebElement element = findElementBase(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }
    public void clickBase(By locator){
        WebElement element = findElementBase(locator);
        element.click();
    }
    public boolean isElementPresent(By locator){return !driver.findElements(locator).isEmpty();}
    public void pause(int time){
        try {
            Thread.sleep(1000L *time);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isTextInElementEquals(By locator, String text){
        return findElementBase(locator).getText().equals(text);
    }
}
