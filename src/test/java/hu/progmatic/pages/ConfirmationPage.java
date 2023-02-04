package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ConfirmationPage {
    WebDriver driver;
    WebDriverWait wait;

    By appointmentConfirmatonMessageBy = By.xpath("//div[@class='col-xs-12 text-center']//h2");
    By dropDownButtonBy = By.id("menu-toggle");
    By logoutButtonBy = By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[5]/a");

    public ConfirmationPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void amIOnConfirmationPage() {
        WebElement appointmentConfirmatonMessage = driver.findElement(appointmentConfirmatonMessageBy);
        Assert.assertEquals(appointmentConfirmatonMessage.getText(),"Appointment Confirmation");
        System.out.println("Appointment Confirmation Finished");
    }
    public void logout() {
        WebElement dropDownButton = driver.findElement(dropDownButtonBy);
        dropDownButton.click();
        WebElement logoutButton = driver.findElement(logoutButtonBy);
        logoutButton.click();
        System.out.println("Logout is completed");
    }
}
