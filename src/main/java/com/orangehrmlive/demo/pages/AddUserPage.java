package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']" )
    WebElement verifyAddUserText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]" )
    WebElement selectUserRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']" )
    WebElement enterEmployeeName;

    @CacheLookup
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']" )
    WebElement enterTheUserName;

    // By enterTheUserName = By.xpath("//input[@class='oxd-input oxd-input--focus']");

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']" )
    WebElement selectStatus;

    @CacheLookup
    @FindBy(xpath = "//div[@class ='oxd-select-dropdown --position-bottom')]")
    WebElement selectAdmin;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement selectDisable;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//font[contains(text(),'Save')]")
    WebElement clickOnSaveButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-actions']")
    WebElement choseAdmin ;


    public String setVerifyAddUserText() {
        return getTextFromElement(verifyAddUserText);
    }

    public void setSelectUserRole(){
        clickOnElement(selectUserRole);
        clickOnElement(choseAdmin);
    }
    public void setEnterEmployeeName(String name){
        sendTextToElement(enterEmployeeName,name);
    }
    public void setEnterTheUserName(String userName){
        sendTextToElement(enterTheUserName,userName);
    }
    public void setSelectStatus(){
        clickOnElement(selectStatus);
    }

    public void setSelectAdmin(){
        selectByContainsTextFromDropDown((By) selectAdmin,"Admin");
    }
    public void setSelectDisable(){
        selectByIndexFromDropDown(selectDisable,0);
    }
    public void setConfirmPassword(String password){
        sendTextToElement(confirmPassword,password);
    }
    public void setClickOnSaveButton(){
        clickOnElement(clickOnSaveButton);
    }
}
