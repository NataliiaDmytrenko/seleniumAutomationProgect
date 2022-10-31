package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetStatusMessageFromDefaultOptionsPage {

    public SetStatusMessageFromDefaultOptionsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@height='32']")
    public WebElement userButton;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement setStatusButton;

    @FindBy(xpath = "//div[@class = 'predefined-status'][1]")
    public WebElement inAmeeting;

    @FindBy(xpath = "//button[@class = 'status-buttons__primary primary']")
    public WebElement setStatusMessage;
}
