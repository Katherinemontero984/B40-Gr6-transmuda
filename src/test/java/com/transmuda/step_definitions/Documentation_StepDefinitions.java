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
import java.util.List;

public class Documentation_StepDefinitions
{

    String expectedUrl = "https://doc.oroinc.com/";
    String expectedTitle = "Welcome to Oro Documentation";

    DocumentationPage documentationPage = new DocumentationPage();

    String mainWindow;

    @And("user click on the {string} icon")
    public void userClickOnTheIcon(String arg0)
    {
        BrowserUtils.sleep(5);

        documentationPage.questionMarkIcon.click();
    }

    @And("user navigates to oroinc documentation page")
    public void userNavigatesToOroincDocumentationPage()
    {

        BrowserUtils.switchWindowAndVerify(expectedUrl, "Welcome to Oro Documentation");
    }


    @Then("user will access the documentation page")
    public void userWillAccessTheDocumentationPage()
    {
        BrowserUtils.sleep(3);

        String expectedUrl = "https://doc.oroinc.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);

    }


}
