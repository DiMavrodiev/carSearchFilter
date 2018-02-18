package pageObject;

import api.Driver;

public class ResultsPage {

    //Wait for a dynamic title to load
    public static String getTitle() throws InterruptedException {
        Thread.sleep(3000);
        return Driver.driver.getTitle();
    }
}
