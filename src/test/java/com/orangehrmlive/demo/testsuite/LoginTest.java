package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    //Declaration
    AddUserPage addUserPage;
    Adminpage adminPage;
    DashboardPage dashboardPage;
    HomePage homePage;
    LoginPage loginPage;
    ViewSystemUsersPage viewSystemUserPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt()
    {
        //Initialisation
        addUserPage= new AddUserPage();
        adminPage = new Adminpage();
        dashboardPage = new DashboardPage();
        homePage = new HomePage();
        loginPage = new LoginPage();
        viewSystemUserPage = new ViewSystemUsersPage();
    }

    @Test(groups={"Sanity" , "Smoke" ,"Regression"})
    public void verifyUserShouldLoginSuccessfully(){
        //Enter username
        homePage.setEnterUserName("Admin");
        //   Enter password
        homePage.setEnterPassword("admin123");
        //   Click on Login Button
        loginPage.setClickOnLogin();
        //   Verify "Dashboard" Message
        String actualMessage = dashboardPage.getVerifyTheTextDashboard();
        String expectedMessage = "WelCome";
        Assert.assertEquals(actualMessage,expectedMessage,"WelCome Text is displayed");
    }

    @Test(groups = {"Smoke" , "Regression"})
    public void verifyThatTheLogoDisplayedOnLoginPage(){
        //Launch the application
        driver.getCurrentUrl();
        //   Verify Logo is Displayed
        homePage.setHrmLogo();
    }

    @Test(groups = {"Regression" })
    public void verifyUserShouldLogoutSuccessfully() throws InterruptedException{
        //Login To The application
        homePage.setEnterUserName("Admin");
        homePage.setEnterPassword("admin123");
        loginPage.setClickOnLogin();
        //   Click on User Profile logo
        adminPage.setClickOnUserProfileLogo();
        //   Mouse hover on "Logout" and click
        adminPage.setMouseHoverOnLogout();
        //   Verify the text "Login Panel" is displayed
        Thread.sleep(2000);
        String actualMessage = homePage.setVerifyLoginPanel();
        String expectedMessage = "Login";
        Assert.assertEquals(actualMessage,expectedMessage,"login message is not displayed");
    }

    @Test(groups = {"Regression" })
    public void verifyErrorMessageWithInvalidCredentials()
    {
        //Enter username
        homePage.setEnterUserName("promo123@yahoo.com");
        //   Enter password
        homePage.setEnterPassword("promo");
        //   Click on Login Button
        loginPage.setClickOnLogin();
        //   Verify "Dashboard" Message
        String actualMessage = dashboardPage.getVerifyTheTextDashboard();
        String expectedMessage ="Welcome  Text is not displayed";
        Assert.assertEquals(actualMessage,expectedMessage,"Welcome  Text is not displayed");
    }
}
