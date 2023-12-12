package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Adminpage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]" )
    WebElement clickOnAdmin;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='profile picture']" )
    WebElement clickOnUserProfileLogo;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logout')]" )
    WebElement mouseHoverOnLogout;


    public void setClickOnAdmin(){
        clickOnElement(clickOnAdmin);
    }
    public void setClickOnUserProfileLogo(){
        clickOnElement(clickOnUserProfileLogo);
    }

    public void setMouseHoverOnLogout(){
        mouseHoverToElementAndClick(mouseHoverOnLogout);
    }
}
