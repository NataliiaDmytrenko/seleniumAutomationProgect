package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name = 'user']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@name = 'password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id = 'submit-form']")
    public WebElement logInButton;

}
