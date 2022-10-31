package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SetCustomStatusMessageWithEmojiPage {

    public SetCustomStatusMessageWithEmojiPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@height='32']")
    public WebElement userButton;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement setStatusButton;

    @FindBy(xpath = "//input[@maxlength = '80']")
    public WebElement WhatYourStatusButton;

    @FindBy(xpath = "//button[@class = 'custom-input__emoji-button']")
    public WebElement emojiButton;

    @FindBy(xpath = "/html/body/div[10]/div/div[1]/div[1]/div/div[2]/input")
    public WebElement smileSearchBox;

    @FindBy(xpath = "/html/body/div[10]/div/div[1]/div[1]/div/div[3]/span/span")
    public WebElement donutButton;

    @FindBy(xpath = "//button[@class = 'status-buttons__primary primary']")
    public WebElement setStatusMessage;
}
