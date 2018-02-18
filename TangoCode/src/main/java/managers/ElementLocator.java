package managers;

import api.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementLocator {

    //Locate by linked text
    public static WebElement linkedText(String locator){
        return Driver.driver.findElement(By.linkText(locator));
    }

    //Locate by CSS selector
    public static WebElement cssSelector(String locator){
        return Driver.driver.findElement(By.cssSelector(locator));
    }

    //Locate by xpath
    public static WebElement xpath(String locator){
        return Driver.driver.findElement(By.xpath(locator));
    }

    //Locate by id
    public static WebElement id(String locator){
        return Driver.driver.findElement(By.id(locator));
    }

    //Locate by tag name
    public static WebElement tagName(String locator){
        return Driver.driver.findElement(By.tagName(locator));
    }

    //Locate by name
    public static WebElement name(String locator){
        return Driver.driver.findElement(By.name(locator));
    }

    //Locate be partial linked text
    public static WebElement partialLinkText(String locator){
        return Driver.driver.findElement(By.partialLinkText(locator));
    }
}
