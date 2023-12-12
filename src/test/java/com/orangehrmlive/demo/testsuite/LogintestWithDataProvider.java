package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.testdata.TestDataForUsersTest;

public class LogintestWithDataProvider extends BaseTest {
    AddUserPage addUserPage;
    Adminpage adminPage;
    DashboardPage dashboardPage;
    HomePage homePage;
    LoginPage loginPage;
    ViewSystemUsersPage viewSystemUserPage;

    @Test(dataProvider = "data set" , dataProviderClass = TestDataForUsersTest.class)
    public void verifyErrorMessageWithInvalidCredentials(String userName , String password , String errorMessage)
    {
        //Enter username
        homePage.setEnterUserName(userName);
        //   Enter password
        homePage.setEnterPassword(password);
        //   Click on Login Button
        loginPage.setClickOnLogin();
        //   Verify "Dashboard" Message
        String actualMessage = dashboardPage.getVerifyTheTextDashboard();
        String expectedMessage = errorMessage;
        Assert.assertEquals(actualMessage,expectedMessage,"Welcome  Text is not displayed");
    }
}
