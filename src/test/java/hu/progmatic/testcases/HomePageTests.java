package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class HomePageTests extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @Test(description = "TC01: Homepage loaded test that loads the page and validates whether the header is displayed or not.")
    public void homepageLoadedTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
    }
    @Test(description = "TC02: We are loading the Homepage and then clicking the Make Appointment button." +
            "Validates that we can see the Username input")
    public void makeAppointmentButtonClickingTest()  {
        homePage = new HomePage(driver,wait);
        homePage.loadHomePage();
        homePage.clickAppointmentButton();
        loginPage = new LoginPage(driver,wait);
        loginPage.amIOnLoginPageTest();
    }

}
