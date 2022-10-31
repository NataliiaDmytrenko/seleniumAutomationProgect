package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OnlineStatusFunctionality_StepDefinitions{

    OnlineStatusPage onlineStatusPage = new OnlineStatusPage();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        String url = ConfigurationReader.getProperty("home.page.url");
        Driver.getDriver().get(url);
    }
    @When("user navigate to user button and clicks")
    public void user_navigate_to_user_button_and_clicks() {
        onlineStatusPage.userButton.click();
    }
    @When("user navigate to Set status button and click")
    public void user_navigate_to_set_status_button_and_click() {
        onlineStatusPage.setStatusButton.click();
    }
    @When("user navigate to Online_Status\\/Online_Button and click")
    public void user_navigate_to_online_status_online_button_and_click() {
        BrowserUtils.sleep(3);
       onlineStatusPage.OnlineStatus_OnlineButton.click();
       BrowserUtils.sleep(3);
    }

    @When("user navigate to CLOSE BUTTON and click")
    public void user_navigate_to_close_button_and_click() {
        onlineStatusPage.closeButton.click();
    }
    @When("user navigate to USER button and click")
    public void user_navigate_to_user_button_and_click() {
        onlineStatusPage.userButton.click();
    }
    @When("user navigate to SET status button")
    public void user_navigate_to_set_status_button() {
     onlineStatusPage.setStatusButton.getText();
    }
    @Then("User sees expected Button Title Online")
    public void user_sees_expected_button_title_online() {
        String expectedTitle = "Online";
        String actualTitle = onlineStatusPage.setStatusButton.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
ChangeOnlineStatusPage changeOnlineStatusPage = new ChangeOnlineStatusPage();

    @Given("user is on CealoHomePage")
    public void user_is_on_cealo_home_page() {
        String url = ConfigurationReader.getProperty("home.page.url");
        Driver.getDriver().get(url);
        changeOnlineStatusPage.userButton.click();
        changeOnlineStatusPage.setStatusButton.click();
    }

    @When("user go to {string} and click")
    public void userGoToAndClick(String onlineStatusButton) {
        for (WebElement each : onlineStatusPage.allStatuses) {
            //BrowserUtils.sleep(10);
            if(each.getText().contains(onlineStatusButton)){
                each.click();
                BrowserUtils.sleep(3);
            }
        }
        changeOnlineStatusPage.closeButton.click();
    }
    @Then("User verify {string}")
    public void user_verify(String expectedTitle) {
        changeOnlineStatusPage.userButton.click();
        BrowserUtils.sleep(3);
        String actualTitle = changeOnlineStatusPage.setStatusButton.getText();
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    SetStatusMessageFromDefaultOptionsPage setStatusMessageFromDefaultOptionsPage = new SetStatusMessageFromDefaultOptionsPage();

    @Given("user is on cealoHome page")
    public void user_is_on_cealo_Home_page() {
        String url = ConfigurationReader.getProperty("home.page.url");
        Driver.getDriver().get(url);
    }
    @When("user navigate to userButton and clicks")
    public void user_navigate_to_user_button_AND_clicks() {
setStatusMessageFromDefaultOptionsPage.userButton.click();
    }
    @When("user navigate to SetStatus button and click")
    public void user_navigate_to_set_status_Button_and_click() {
setStatusMessageFromDefaultOptionsPage.setStatusButton.click();
    }
    @When("user navigate to StatusMessage\\/inAmeeting button and click")
    public void user_navigate_to_status_message_in_ameeting_button_and_click() {
        setStatusMessageFromDefaultOptionsPage.inAmeeting.click();
    }
    @When("user navigate to SetStatusMessage button and click")
    public void user_navigate_to_set_status_message_button_and_click() {
setStatusMessageFromDefaultOptionsPage.setStatusMessage.click();
    }
    @When("user navigate to userButton and click")
    public void user_navigate_to_user_button_AND_click() {
setStatusMessageFromDefaultOptionsPage.userButton.click();
    }
    @When("user navigate to SetStatus button")
    public void user_navigate_to_Set_status_button() {
setStatusMessageFromDefaultOptionsPage.setStatusButton.getText();
    }
    @Then("User sees expected ButtonTitle In a meeting")
    public void user_sees_expected_button_title_in_a_meeting() {
        String expectedTitle = "\uD83D\uDCC5 In a meeting";
        String actualTitle = setStatusMessageFromDefaultOptionsPage.setStatusButton.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    SetCustomStatusMessageWithEmojiPage customStatusMessageWithEmojiPage = new SetCustomStatusMessageWithEmojiPage();

    @Given("user is on CEALOhome page")
    public void user_is_on_ceal_ohome_page() {
        String url = ConfigurationReader.getProperty("home.page.url");
        Driver.getDriver().get(url);
    }
    @When("user navigate to userBUTTON and clicks")
    public void user_navigate_to_User_button_and_clicks() {
    customStatusMessageWithEmojiPage.userButton.click();
    }
    @When("user navigate to SetStatus BUTTON and click")
    public void user_navigate_to_Set_status_button_and_click() {
    customStatusMessageWithEmojiPage.setStatusButton.click();
    }
    @When("user enters custom status message")
    public void user_enters_custom_status_message() {
        customStatusMessageWithEmojiPage.WhatYourStatusButton.sendKeys("Happy hours");
    }
    @When("user choose emoji")
    public void user_choose_emoji() {
        customStatusMessageWithEmojiPage.emojiButton.click();
        customStatusMessageWithEmojiPage.smileSearchBox.sendKeys("donut");
        customStatusMessageWithEmojiPage.donutButton.click();
    }
    @When("user navigate to SetStatusMessage BUTTON and click")
    public void user_navigate_to_Set_status_message_button_and_click() {
customStatusMessageWithEmojiPage.setStatusMessage.click();
    }
    @When("user navigate to userBUTTON and click")
    public void user_navigate_to_User_button_and_click() {
customStatusMessageWithEmojiPage.userButton.click();
    }
    @When("user navigate to SetStatus BUTTON")
    public void user_navigate_to_SetStatus_button() {
customStatusMessageWithEmojiPage.setStatusButton.getText();
    }
    @Then("User sees expected ButtonTitle Happy hours")
    public void user_sees_expected_button_title_happy_hours() {
        String expectedTitle = "\uD83C\uDF69 Happy hours";
        String actualTitle = customStatusMessageWithEmojiPage.setStatusButton.getText();

        Assert.assertEquals(expectedTitle,actualTitle);

    }
    ClearStatusMessagePage clearStatusMessagePage = new ClearStatusMessagePage();
    @Given("user is on CEALO home page")
    public void user_is_on_Cealo_home_page() {
        String url = ConfigurationReader.getProperty("home.page.url");
        Driver.getDriver().get(url);
    }

    @When("user navigate to user BUTTON and clicks")
    public void user_navigate_to_user_Button_and_clicks() {
clearStatusMessagePage.userButton.click();
    }

    @When("user navigate to Set Status BUTTON and click")
    public void user_navigate_to_set_status_BUTTON_and_click() {
clearStatusMessagePage.setStatusButton.click();
    }

    @When("user navigate to CLEAR Status BUTTON and click")
    public void user_navigate_to_clear_status_button_and_click() {
clearStatusMessagePage.clearStatusMessage.click();
    }

    @When("user navigate to user BUTTON and click")
    public void user_navigate_to_user_BUTTON_and_click() {
clearStatusMessagePage.userButton.click();
    }

    @When("user navigate to Set Status BUTTON")
    public void user_navigate_to_Set_Status_button() {
clearStatusMessagePage.setStatusButton.getText();
    }

    @Then("User sees expected Button Title")
    public void user_sees_expected_button_title() {
        String expectedTitle = "Invisible";
        String actualTitle = clearStatusMessagePage.setStatusButton.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
