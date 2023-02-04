package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.ConfirmationPage;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class AppointmentPageTest extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    AppointmentPage appointmentPage;
    ConfirmationPage confirmationPage;


    @Test(description = "TC04: Testing a succesfull login and booking. Validates that we get the Confirmation Page")
    public void makeAnAppointmentTest() throws InterruptedException {
        homePage = new HomePage(driver,wait);
        homePage.loadHomePage();
        homePage.clickAppointmentButton();
        loginPage = new LoginPage(driver,wait);
        loginPage.loginWitGoodInputs();
        appointmentPage = new AppointmentPage(driver,wait);
        appointmentPage.clickOnDateThenBook();
        confirmationPage = new ConfirmationPage(driver,wait);
        confirmationPage.amIOnConfirmationPage();




    }


}
