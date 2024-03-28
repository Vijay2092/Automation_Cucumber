package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;

    // Web Elements
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement searchButton;


    // Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public void searchProduct(String productName) {
        searchBox.sendKeys(productName);

       // searchBox.sendKeys(Keys.RETURN);
    }
    public  void clickButton(){
        searchButton.click();
    }
}
