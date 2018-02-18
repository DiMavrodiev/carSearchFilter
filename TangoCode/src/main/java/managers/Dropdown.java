package managers;

import api.Driver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    //Select by id
    public static Select selectById(String locator){
        return Driver.select  = new Select(ElementLocator.id(locator));
    }

    //Select by name
    public static Select selectByName(String locator){
        return Driver.select = new Select(ElementLocator.name(locator));
    }

    //Select by CSS selector
    public static Select selectByCss(String locator){
        return Driver.select = new Select(ElementLocator.cssSelector(locator));
    }

    //Select bt xpath
    public static Select selectByXpath(String locator){
        return Driver.select = new Select(ElementLocator.xpath(locator));
    }

    //Select by linked text
    public static Select selectByLinkedText(String locator){
        return Driver.select = new Select(ElementLocator.linkedText(locator));
    }

    //Select by partial linked text
    public static Select seletByPartialLinkedText(String locator){
        return Driver.select = new Select(ElementLocator.partialLinkText(locator));
    }

    //Select by tag name
    public static Select selectByTagName(String locator){
        return Driver.select = new Select(ElementLocator.tagName(locator));
    }



}
