package pageObject;

import managers.Dropdown;
import managers.ElementLocator;
import managers.MyLogger;


public class HomePage {

    //Search for a car based on criteria
    public static void searchCar(String condition, String make, String model, String price, String miles, String zip){

        //Select car condition
        Dropdown.selectById("stockTypeSelect").selectByVisibleText(condition);
        MyLogger.log.info(condition + " selected");

        //Select car maker
        Dropdown.selectById("makeSelect").selectByVisibleText(make);
        MyLogger.log.info(make + " selected");

        //Select car model
        Dropdown.selectById("modelSelect").selectByVisibleText(model);
        MyLogger.log.info(model + " selected");

        //Select max price
        Dropdown.selectByCss("select[name='prMx']").selectByVisibleText(price);
        MyLogger.log.info(price + " selected");

        //Select radius
        Dropdown.selectByCss("select[name='rd']").selectByVisibleText(miles);
        MyLogger.log.info(miles + " selected");

        //Enter zip code
        ElementLocator.id("zipInput").clear();
        ElementLocator.id("zipInput").sendKeys(zip);
        MyLogger.log.info(zip + " entered");

        //Click search
        ElementLocator.id("superWidgetSubmit").click();
    }

}
