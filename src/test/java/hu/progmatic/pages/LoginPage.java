package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;


    By usernameInputBy = By.id("txt-username");
    By passwordInputBy = By.id("txt-password");
    By loginButtonBy = By.id("btn-login");
    By errorMessageBy = By.cssSelector("p[class='lead text-danger']");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void loginWithBadInputs() {
        WebElement usernameInput = driver.findElement(usernameInputBy);
        usernameInput.sendKeys("sas");
        WebElement passwordInput = driver.findElement(passwordInputBy);
        passwordInput.sendKeys("bab");
        WebElement loginButton = driver.findElement(loginButtonBy);
        loginButton.click();
        WebElement errorMessage = driver.findElement(errorMessageBy);
        errorMessage.isDisplayed();
        System.out.println("Error message is displayed");
    }
    public void loginWitGoodInputs() {
        WebElement usernameInput = driver.findElement(usernameInputBy);
        usernameInput.sendKeys("John Doe");
        WebElement passwordInput = driver.findElement(passwordInputBy);
        passwordInput.sendKeys("ThisIsNotAPassword");
        WebElement loginButton = driver.findElement(loginButtonBy);
        loginButton.click();
        System.out.println("Succesfull Login");
    }
    public void amIOnLoginPageTest() {
        WebElement usernameInput = driver.findElement(usernameInputBy);
        usernameInput.isDisplayed();
        System.out.println("Make Appointment button clicked and navigated to Login Page");
    }
}
