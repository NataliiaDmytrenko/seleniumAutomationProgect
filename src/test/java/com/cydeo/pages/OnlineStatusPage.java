package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.eo.Do;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OnlineStatusPage {

    public OnlineStatusPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@height='32']")
    public WebElement userButton;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement setStatusButton;

    @FindBy(xpath = "//label[@class='user-status-online-select__label icon-user-status-online']")
    public WebElement OnlineStatus_OnlineButton;

    @FindBy(xpath = "//label[contains(@class,'user-status')]")
    public List<WebElement> allStatuses;
    
    
    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[1]/div[2]/button")
    public WebElement closeButton;


    /*public void chooseStatus(String status) {
        for (WebElement each : allStatuses) {
            String url = ConfigurationReader.getProperty("home.page.url");
            Driver.getDriver().get(url);
            onlineStatusPage.userButton.click();
            onlineStatusPage.setStatusButton.click();
            each.click();
            onlineStatusPage.closeButton.click();
            onlineStatusPage.setStatusButton.getText();
            ArrayList<WebElement> expectedTitle= ("Online", "Away", "Do not disturb","Invisible");
            for (WebElement element : expectedTitle) {
                setStatusButtons
                String actualTitle = onlineStatusPage.setStatusButton.getText();
                Assert.assertEquals(expectedTitle,actualTitle);
            }
        }
    }*/
}
