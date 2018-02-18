package browsers;

import api.Driver;
import api.Timeout;
import managers.MyLogger;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

    //Setup browser properties
    public static void startEdge(){
        MyLogger.log.info("Initializing MS Edge browser");
        System.setProperty("webdriver.edge.driver", "C:\\developer\\SeleniumDrivers\\MicrosoftWebDriver.exe");

        //Open full screen browser
        Driver.driver = new EdgeDriver();
        Driver.driver.manage().window().maximize();
        Timeout.waitToLoad();
    }
}
