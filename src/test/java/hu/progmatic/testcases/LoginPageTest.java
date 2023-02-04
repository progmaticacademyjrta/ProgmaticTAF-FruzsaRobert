package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @Test(description = "TC03: Trying to login with wrong input.Validates that we get the error message")
    public void errorMessageWithNotValidLoginTest() {
        homePage = new HomePage(driver,wait);
        homePage.loadHomePage();
        homePage.clickAppointmentButton();
        loginPage = new LoginPage(driver,wait);
        loginPage.loginWithBadInputs();
    }

}
