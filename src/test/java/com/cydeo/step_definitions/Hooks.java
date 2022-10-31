package com.cydeo.step_definitions;

import com.cydeo.pages.ClearStatusMessagePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.OnlineStatusPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    LoginPage loginPage = new LoginPage();
    ClearStatusMessagePage clearStatusMessagePage = new ClearStatusMessagePage();

    @Before
      public void setupLogIn(){
        String url = ConfigurationReader.getProperty("log.in.url");
        Driver.getDriver().get(url);
        loginPage.inputUsername.sendKeys("Employee41");
        loginPage.inputPassword.sendKeys("Employee123");
        loginPage.logInButton.click();
    }

     @Before
       public void clearMethod(){
       String url = ConfigurationReader.getProperty("home.page.url");
       Driver.getDriver().get(url);
       clearStatusMessagePage.userButton.click();
       clearStatusMessagePage.setStatusButton.click();
       clearStatusMessagePage.clearStatusMessage.click();
    }

    @After
    public void teardownScenario(Scenario scenario){

        if(scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
