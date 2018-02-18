package homePage;

import api.Driver;
import managers.Setup;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.ResultsPage;

import java.io.IOException;

public class SearchFilterTest {

    //Setup browser and navigate to URL
    @BeforeTest
    public void setupBrowser() throws IOException {
        Setup.browserSetup();
    }

    //Test car search
    @Test
    public void searchCarTest()throws InterruptedException {
        HomePage.searchCar("New Cars", "Buick", "Encore", "$25,000", "20 Miles from", "60173");

        Assert.assertTrue(ResultsPage.getTitle().contains("New"));
        Assert.assertTrue(ResultsPage.getTitle().contains("Buick"));
        Assert.assertTrue(ResultsPage.getTitle().contains("Encore"));
        Assert.assertTrue(ResultsPage.getTitle().contains("60173"));
    }

    //Close browser
    @AfterTest
    public void close(){
        Driver.driver.close();
    }
}
