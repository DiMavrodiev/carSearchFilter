package managers;

import api.Driver;
import browsers.ChromeBrowser;
import browsers.EdgeBrowser;
import browsers.FirefoxBrowser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Setup {

    //Setup browser
    public static void browserSetup() throws IOException {

        //Setup properties
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\TangoCode\\src\\main\\resources\\data.properties");
        properties.load(fileInputStream);
        String browserName = properties.getProperty("browser");

        //Select browser
        if (browserName.equals("chrome")){
            ChromeBrowser.startChrome();
            Driver.driver.get(properties.getProperty("url"));
        } else if (browserName.equals("firefox")){
            FirefoxBrowser.startFirefox();
            Driver.driver.get(properties.getProperty("url"));
        } else if (browserName.equals("edge")){
            EdgeBrowser.startEdge();
            Driver.driver.get(properties.getProperty("url"));
        }
    }
}
