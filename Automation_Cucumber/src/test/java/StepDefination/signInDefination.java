package StepDefination;


import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.joda.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.SignInPage;


public class signInDefination {
    SignInPage signInPage;
    WebDriver driver;
    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Given("I am on the Amazon sign-in page")
    public void i_am_on_the_amazon_sign_in_page() throws InterruptedException {
     try {
         driver.get("https://www.amazon.in");
         driver.manage().window().maximize();
         Thread.sleep(3000);
         signInPage = new SignInPage(driver);
     }catch (Exception e){
         System.out.println("Site is not working");
     }

//        String title = driver.getTitle();
//        while (!"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in".equals(title)){
//            driver.get("https://www.amazon.in");
//            title = driver.getTitle();
//        }
    }

    @When("I have entered a valid email click continue")
    public void i_have_entered_a_valid_email_click_continue() {
        try {
            signInPage.hoverOnSignIn();
            signInPage.emailProvider("patilvijaysing2092@gmail.com");
        }catch (NoSuchElementException | TimeoutException e){
            System.out.println("Element is not found");
        }
    }

    @And("I have entered a valid password click signIn")
    public void i_have_entered_a_valid_password_click_sign_in() {
        try {
            signInPage.passwordProvider("Vijay@6767");
        }catch (NoSuchElementException | TimeoutException e){
            System.out.println("Password field is not found");
        }
    }

    @Then("I should be signed in successfully")
    public void iShouldBeSignedInSuccessfully() {
        System.out.println("signed In !!");
    }


    @When("I have entered an incorrect email {string} click continue")
    public void i_have_entered_an_incorrect_email_click_continue(String email) {
        try {
            signInPage.hoverOnSignIn();
            signInPage.emailProvider(email);
        }catch (NoSuchElementException | TimeoutException e){
            System.out.println("Element is not found");
        }
    }

    @When("I have entered a valid password {string} click signIn")
    public void i_have_entered_a_valid_password_click_sign_in(String password) {
        try {
            signInPage.passwordProvider(password);
        }catch (NoSuchElementException | TimeoutException e){
            System.out.println("Password field is not found");
        }
    }
}
