package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {
    WebDriver driver;
    Actions action;

    public SignInPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    WebElement hoverButton;

    @FindBy(xpath = "(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]")
     WebElement signInButton;

    @FindBy(xpath ="//input[@id='ap_email']" )
    WebElement emailField;

    @FindBy(xpath = "//input[@class='a-button-input']")
    WebElement continueButton;
    @FindBy(id = "ap_password")
    WebElement password;

    @FindBy(id="signInSubmit")
    WebElement confirmSignInButton;

    public void hoverOnSignIn() {
       // WebDriverWait wait= (WebDriverWait) new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(hoverButton));
        action= new Actions(driver);
        action.moveToElement(hoverButton).pause(Duration.ofSeconds(5)).moveToElement(signInButton).click().perform();
    }

    public boolean emailProvider (String email) {
        try {
            emailField.sendKeys(email);
            continueButton.click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean passwordProvider (String passwordProvide) {
        try {
            password.sendKeys(passwordProvide);
            confirmSignInButton.click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
