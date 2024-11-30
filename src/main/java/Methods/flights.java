package Methods;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class flights {
    WebDriver driver;
    DriverSetup driverSetup = new DriverSetup();
    public flights flightsPage = DriverSetup.flightsPage;


    private String closePopup = "//span[@data-cy='closeModal']";
    private String flightsBtn = "//li[@data-cy='menu_Flights']//span[text()='Flights'][1]";
    private String oneWayBtn = "//li[@data-cy='oneWayTrip']//span";
    private String Btn_From = "//label[@for='fromCity']/span[.='From']";
    private String search_From = "//label[@for='fromCity']/following-sibling::div//input[@placeholder='From']";
    private String select_From = "//*[.='fromAirport']/ancestor::li";
    private String Btn_To = "//label[@for='toCity']/span[.='To']";
    private String search_To = "//label[@for='toCity']//input[@id='toCity']";
    private String select_To = "//*[.='toAirport']/ancestor::li";
    private String select_date = "//div[contains(@aria-label,'todays_date')]";
    private String search_Button = "//a[.= 'Search']";



    public flights(WebDriver getdriver) {
        driver = getdriver;
    }

    public void launchFlightsURL(String url) {
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        // close popup
        driver.findElement(By.xpath(closePopup)).click();
    }

    public void selectOneWayFlight() {
        // flights Click
        driver.findElement(By.xpath(flightsBtn)).click();

        // one way button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(oneWayBtn)));
        driver.findElement(By.xpath(oneWayBtn)).click();
    }

    public void selectFromFlightDestination(String fromDest, String fromAirport) {
        // Select from
        driver.findElement(By.xpath(Btn_From)).click();
        driver.findElement(By.xpath(search_From)).sendKeys(fromDest);
        select_From = select_From.replace("fromAirport", fromAirport);
        driver.findElement(By.xpath(select_From)).click();
    }

    public void selectToFlightDestination(String toDest, String toAirport) {
        // Select To
        driver.findElement(By.xpath(Btn_To)).click();
        driver.findElement(By.xpath(search_To)).sendKeys(toDest);
        select_To = select_To.replace("toAirport", toAirport);
        driver.findElement(By.xpath(select_To)).click();
    }


    public void selectTodaysDate(String date){
//        select_date = select_date.replace("todays_date","date");
        select_date = select_date.replace("todays_date","Dec 02 2024");
        driver.findElement(By.xpath(select_date)).click();

    }

   public void clickSearch(){
        driver.findElement(By.xpath(search_Button)).click();
   }


}