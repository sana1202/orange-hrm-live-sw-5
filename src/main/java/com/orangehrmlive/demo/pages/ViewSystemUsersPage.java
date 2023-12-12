package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUsersPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']" )
    WebElement VerifyTextSystemUser ;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']" )
    WebElement clickingAddButton ;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]" )
    WebElement enterUsername;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']" )
    WebElement enterSearch ;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'khilenpatel123')]")
    WebElement  verifyTheResult;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement   tickOnCheckbox ;

    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement   clickOnDeleteButton;


    public String setVerifyTextSystemUser(){
        return  getTextFromElement(VerifyTextSystemUser);

    }
    public void setClickingAddButton(){
        clickOnElement(clickingAddButton);
    }

    public void setEnterUsername(String user){
        sendTextToElement(enterUsername,user);
    }
    public void setEnterSearch(){
        clickOnElement(enterSearch);
    }

    public String setVerifyTheResult(){
        return getTextFromElement(verifyTheResult);
    }

    public void setTickOnCheckbox(){
        clickOnElement(tickOnCheckbox);
    }

    public void setClickOnDeleteButton(){
        clickOnElement(clickOnDeleteButton);
    }
}
