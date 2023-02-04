package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage {
    WebDriver driver;
    WebDriverWait wait;

    By dropDownButtonBy = By.id("menu-toggle");
    By profileButtonBy = By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[4]/a");
    By profileTextBy = By.xpath("//div[@class='col-lg-12 text-center']//h2");

    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void goToProfilePage() {
        WebElement dropDownButton = driver.findElement(dropDownButtonBy);
        dropDownButton.click();
        WebElement profileButton = driver.findElement(profileButtonBy);
        profileButton.click();
    }

    public void amIOnProfilePage() {
        WebElement profileText = driver.findElement(profileTextBy);
        Assert.assertEquals(profileText.getText(),"Profile");
        System.out.println("Navigated to ProfilePage");
    }

}
