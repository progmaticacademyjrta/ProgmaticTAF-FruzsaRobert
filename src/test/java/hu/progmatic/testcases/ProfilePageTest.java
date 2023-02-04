package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.ProfilePage;
import org.testng.annotations.Test;

public class ProfilePageTest extends DriverBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    ProfilePage profilePage;

    @Test(description = "TC05: Checks if we can get to Profile Page.Validates if we can see the Profile text.")
    public void goToProfilePageTest() {
        homePage = new HomePage(driver,wait);
        homePage.loadHomePage();
        homePage.clickAppointmentButton();
        loginPage = new LoginPage(driver,wait);
        loginPage.loginWitGoodInputs();
        profilePage =new ProfilePage(driver,wait);
        profilePage.goToProfilePage();
        profilePage.amIOnProfilePage();
    }
}
