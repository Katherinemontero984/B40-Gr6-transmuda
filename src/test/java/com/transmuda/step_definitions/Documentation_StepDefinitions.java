package com.transmuda.step_definitions;

import com.transmuda.pages.DocumentationPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Dictionary;

public class Documentation_StepDefinitions
{

    DocumentationPage documentationPage = new DocumentationPage();

    String mainWindow;

    @Given("user is on the home page")
    public void user_is_on_the_home_page()
    {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitForPageToLoad(5);
        mainWindow = Driver.getDriver().getWindowHandle(); // Storing the current window

    }


    @When("the user is logged in as {string}")
    public void theUserIsLoggedInAs(String userType)
    {

    }


    @And("user click on the {string} icon")
    public void user_click_on_the_icon(String questionMark)
    {
        // I'm waiting to click
        BrowserUtils.waitForClickablility(documentationPage.questionMarkIcon,5).click();
    }


    @Then("a new window should open with URL {string}")
    public void aNewWindowShouldOpenWithURL(String expectedUrl)
    {
        //waiting for a second window to open
        BrowserUtils.switchToWindow(mainWindow);

        String actual = Driver.getDriver().getCurrentUrl();
        String expected = "https://doc.oroinc.com/";

        Assert.assertEquals(expected, actual);
    }






}
