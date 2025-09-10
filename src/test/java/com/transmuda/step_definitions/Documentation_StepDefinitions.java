package com.transmuda.step_definitions;

import com.transmuda.pages.DocumentationPage;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.WebElement;

import java.util.Dictionary;

public class Documentation_StepDefinitions
{

    DocumentationPage documentationPage = new DocumentationPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page()
    {
        Driver.getDriver().get("https://qa.transmuda.com/user/login");
    }
    @When("user enter the {string} information")
    public void user_enter_the_information(String userType)
    {

    }

    @Then("user should be able to login")
    public void userShouldBeAbleToLogin()
    {

    }


    @When("user click on the {string} icon")
    public void user_click_on_the_icon(String questionMark)
    {

    }
    @Then("user should be redirected to {string}")
    public void user_should_be_redirected_to(String expectedURL)
    {

    }


}
