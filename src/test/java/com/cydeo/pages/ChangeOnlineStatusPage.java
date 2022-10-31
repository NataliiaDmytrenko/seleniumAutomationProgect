package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChangeOnlineStatusPage {

    public ChangeOnlineStatusPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@height='32']")
    public WebElement userButton;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement setStatusButton;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-dnd']")
    public WebElement OnlineStatus_doNotDisturbButton;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[1]/div[2]/button")
    public WebElement closeButton;

    @FindBy(xpath = "//label[contains(@class,'user-status')]")
    public List<WebElement> allStatuses;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-away']")
    public WebElement OnlineStatus_Away;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-online']")
    public WebElement OnlineStatus_OnlineButton;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-invisible']")
    public WebElement OnlineStatus_Invisible;


}
