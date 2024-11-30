//package Methods;
//
//import com.github.javafaker.Faker;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.nio.channels.Selector;
//import java.time.Duration;
//import java.util.Set;
//
//public class CommonMethods {
//
//
//
//    static WebDriver driver;
//    WebDriverWait wait;
//    public WebDriver ChromeDriver(){
//        WebDriverManager.chromedriver().setup();
//
//        driver = new ChromeDriver();
//        return driver;
//    }
//    public void launchTheMakemyTripWebsite(String url) throws InterruptedException {
//
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        driver.get(url);
//        Thread.sleep(3000);
//    }
//
//    public void enterMobileNumber(){
//      wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Set<String> windowIds = driver.getWindowHandles();
//        System.out.println(windowIds.size());
//        WebElement mobileNumberField = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
//
//        // Generate dynamic mobile number
//        Faker faker = new Faker();
//        String mobileNumber = faker.phoneNumber().cellPhone();
//        if (mobileNumberField.isDisplayed() && mobileNumberField.isEnabled()) {
//            mobileNumberField.sendKeys(mobileNumber);
//        } else {
//            System.out.println("Mobile input field is not interactable.");
//        }
//        System.out.println("Generated mobile number :" + mobileNumber);
//    }
//
//
//    public void ClickContinueWithValidMobileNumber() throws InterruptedException {
//
//        WebElement continueButton = driver.findElement(By.xpath("//span[normalize-space()='Continue']"));
//        WebElement closeButton = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
//        closeButton.click();
//        Thread.sleep(10);
//    }
//
//    public String generateFakeOTP() {
//        int otp = (int) (Math.random() * 1000000); // Generate a 6-digit OTP
//        return String.format("%06d", otp); // Format it to always be 6 digits
//
//    }
//
//    public void enterOtp(){
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        // Simulate OTP input (Since this is a test, generate a fake OTP)
//        String otp = generateFakeOTP();
//        System.out.println("Generated OTP: " + otp);
//
//        new WebDriverWait(driver, Duration.ofSeconds(10));
//
////        WebElement otpInput = driver.findElement(By.xpath("//button[@class='capText font16']"));
////        otpInput.click();
//
//        // Wait for the OTP input field to appear and input the OTP
//        WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter OTP']")));
//        otpField.sendKeys(otp);
//
//        // Optionally, click the verify or submit button after entering the OTP
//        WebElement verifyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='capText font16']")));
//        verifyButton.click();
//
//
//
//    }
//    public void clickFlights() throws InterruptedException {
//        WebElement flights = driver.findElement(By.xpath("//li[@data-cy='menu_Flights']//span[text()='Flights'][1]"));
//        flights.click();
//        Thread.sleep(10);
//    }
//
//    public void bookFlights(){
//        // Click on round-trip option
//        WebElement roundTripOption = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='top-banner']/div[@class='minContainer']/div[1]"));
//        roundTripOption.click();
//
//        // Select from city
//        WebElement fromCity = driver.findElement(By.xpath("//label[@for='fromCity']"));
//        fromCity.click();
//
////        WebElement fromCityInput = driver.findElement(By.xpath("//input[@role='combobox']"));
////        fromCityInput.sendKeys("Chennai");
//
//        // Wait for city suggestions to appear and select one
//        WebElement citySuggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li//div[text()='Chennai, India']")));
//        citySuggestion.click();
//
//    }
////    public void bookBuses(){
////        WebElement bus = driver.findElement(By.linkText("Bus Tickets"));
////        bus.click();
////    }
//}
