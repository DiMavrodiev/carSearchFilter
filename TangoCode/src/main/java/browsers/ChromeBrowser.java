package browsers;

import api.Driver;
import api.Timeout;
import managers.MyLogger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {

    //Setup browser properties
    public static void startChrome(){
        MyLogger.log.info("Initializing Chrome browser");
        System.setProperty("webdriver.chrome.driver", "C:\\developer\\SeleniumDrivers\\chromedriver.exe");

        //Open full screen browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        Driver.driver = new ChromeDriver(options);
        Timeout.waitToLoad();
    }
}





