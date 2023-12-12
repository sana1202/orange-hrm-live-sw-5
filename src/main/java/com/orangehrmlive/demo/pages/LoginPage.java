package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']" )
    WebElement clickOnLogin;

    public void setClickOnLogin(){
        clickOnElement(clickOnLogin);
    }
}
