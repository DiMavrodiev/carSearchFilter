package api;

import java.util.concurrent.TimeUnit;

public class Timeout {

    //Implicit synchronization
    public static void waitToLoad(){

        Driver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
