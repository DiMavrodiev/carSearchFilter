package browsers;

import api.Driver;
import api.Timeout;
import managers.MyLogger;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

    //Setup browser properties
    public static void startFirefox(){
        MyLogger.log.info("Initializing Firefox browser");
        System.setProperty("webdriver.gecko.driver", "C:\\developer\\SeleniumDrivers\\geckodriver.exe");

        //Open full screen browser
        Driver.driver = new FirefoxDriver();
        Driver.driver.manage().window().maximize();
        Timeout.waitToLoad();
    }
}
