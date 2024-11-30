//package StepDefinition;
//
//import Methods.CommonMethods;
//import com.github.javafaker.Faker;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.Set;
//
//public class Login {
//
//
//    CommonMethods cm = new CommonMethods();
//
//    @Given("Launch the MakeMyTrip website {string}")
//    public void launchTheMakemyTripWebsite(String url) throws InterruptedException {
//        cm.ChromeDriver();
//        cm.launchTheMakemyTripWebsite(url);
//    }
//
////    @When("you are a new user")
////    public void youAreANewUser() {
////        cm.enterMobileNumber();
////        cm.ClickContinueWithValidMobileNumber();
////        cm.enterOtp();
//
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")));
//////        System.out.println("Sign-up modal is visible.");
//////        WebElement signUpButton= driver.findElement(By.xpath("//p[@data-cy='LoginHeaderText']"));
//////        signUpButton.click();
////        Set<String> windowIds = driver.getWindowHandles();
////        System.out.println(windowIds.size());
////        WebElement mobileNumberField = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
////
////        // Generate dynamic mobile number
////        Faker faker = new Faker();
////        String mobileNumber = faker.phoneNumber().cellPhone();
////        if (mobileNumberField.isDisplayed() && mobileNumberField.isEnabled()) {
////            mobileNumberField.sendKeys(mobileNumber);
////        } else {
////            System.out.println("Mobile input field is not interactable.");
////        }
////        System.out.println("Generated mobile number :" + mobileNumber);
//
////        WebElement continueButton = driver.findElement(By.xpath("//button[@class='capText font16']"));
////        continueButton.click();
////
////        WebElement sendOtpButton = driver.findElement(By.xpath("//button[@class='capText font16']"));
////        sendOtpButton.click();
//
//        // Simulate OTP input (Since this is a test, generate a fake OTP)
////        String otp = generateFakeOTP();
////        System.out.println("Generated OTP: " + otp);
//
////        // Wait for the OTP input field to appear and input the OTP
////        WebElement otpField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter OTP']")));
////        otpField.sendKeys(otp);
////
////        // Optionally, click the verify or submit button after entering the OTP
////        WebElement verifyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='capText font16']")));
////        verifyButton.click();
//
////    }
////    // Method to generate a fake 6-digit OTP
////    public String generateFakeOTP() {
////        int otp = (int) (Math.random() * 1000000); // Generate a 6-digit OTP
////        return String.format("%06d", otp); // Format it to always be 6 digits
//
////    }
//
//    @When("you close the user register pop up")
//    public void youCloseTheUserRegisterPopUp() throws InterruptedException {
//        cm.ClickContinueWithValidMobileNumber();
//    }
//
//    @When("Book a flight")
//    public void bookAFlight() throws InterruptedException {
//        cm.clickFlights();
//        cm.bookFlights();
//    }
//
////    @And("Book a Bus")
////    public void bookABus() {
////        cm.bookBuses();
////    }
//}
