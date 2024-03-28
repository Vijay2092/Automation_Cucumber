package StepDefination;

import Pages.SearchPage;
import Pages.SignInPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchDefinition {
    SignInPage signInPage;
    SearchPage searchPage;
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
    @Given("I am on the Amazon homepage")
    public void i_am_on_the_amazon_homepage() {
        driver.get("https://www.amazon.in");
    }

    @When("I enter {string} into the search bar")
    public void i_enter_into_the_search_bar(String productName) {
        searchPage.searchProduct(productName);
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() {
        searchPage.clickButton();
    }

    @Then("I should see search results related to {string}")
    public void i_should_see_search_results_related_to(String string) {

    }

}
