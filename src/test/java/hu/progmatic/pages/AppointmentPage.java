package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AppointmentPage {
    WebDriver driver;
    WebDriverWait wait;
    By calendarButtonBy = By.cssSelector("[class='glyphicon glyphicon-calendar']");
    By dateofAppointmentBy = By.xpath("//td[@class='day']");
    By bookButtonBy = By.id("btn-book-appointment");

    public AppointmentPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void clickOnDateThenBook() {
        WebElement calendarButton = driver.findElement(calendarButtonBy);
        calendarButton.click();
        WebElement dateOfAppointment = driver.findElement(dateofAppointmentBy);
        dateOfAppointment.click();
        WebElement bookAppointmentButton = driver.findElement(bookButtonBy);
        bookAppointmentButton.click();
        System.out.println("Date given for appointment");

    }




    }


