package StepDefinitions;

import Methods.DriverSetup;
import Methods.flights;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class MakeMyTRip {

    public DriverSetup ds = new DriverSetup();
    public WebDriver driver = ds.driversetup();
    public flights flightsPage = new flights(driver);
//    DriverSetup driversetup = new DriverSetup();

    @Given("Launch MakeMyTrip Website")
    public void launchMakeMyTripWebsite() {
   flightsPage.launchFlightsURL("https://www.makemytrip.com/flights/");
    }

    @When("Select One way Flight")
    public void selectOneWayFlight() {
        flightsPage.selectOneWayFlight();
        
    }

    @And("Select the from Destination as {string} from {string} Airport")
    public void selectTheFromDestinationAsFromAirport(String arg0, String arg1) {
        flightsPage.selectFromFlightDestination("Chennai","MAA");
        
    }

    @And("Select the To Destination as {string} from {string} Airport")
    public void selectTheToDestinationAsFromAirport(String arg0, String arg1) {
        flightsPage.selectToFlightDestination("Mumbai","BOM");
    }

    @And("Select todays date")
    public void selectTodaysDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd yyyy");
        String stringFormattedDate = date.format(dtf);
        flightsPage.selectTodaysDate(stringFormattedDate);
        System.out.println(date + "Today's date ");

    }

    @And("Search for flights")
    public void searchForFlights() {
        flightsPage.clickSearch();
    }


}
