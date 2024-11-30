package Methods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
    public static WebDriver driver;
    public  static flights flightsPage;
    public static Scenario scenario;
    public static DriverSetup driverSetup = new DriverSetup();


    public WebDriver driversetup() {
        System.out.println("----->driverSetup");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        flightsPage = new flights(driver);
        return driver;


    }
    @After
    public void closeBrowser(){
        driver.quit();

    }


}
