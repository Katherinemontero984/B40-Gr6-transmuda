package com.transmuda.step_definitions;

import com.transmuda.pages.RecurringCalendarEventPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import com.transmuda.pages.BasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.RecurringCalendarEventPage;
import com.transmuda.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Events;

import java.util.Calendar;

public class RecurringCalendarEventStepDefs {


    @And("User navigates to the module")
    public void navigateToModule() {
        RecurringCalendarEventPage calendarPage = new RecurringCalendarEventPage();
        calendarPage.waitUntilLoaderScreenDisappear();
        calendarPage.navigateToModule("Activities", "Calendar Events");
    }


    @When("User clicks at the {string} button")
    public void user_clicks_at_the_button(String buttonName) {
        RecurringCalendarEventPage calendarPage = new RecurringCalendarEventPage();
        calendarPage.waitUntilLoaderScreenDisappear();
        calendarPage.createCalendarEventButton.click();
    }

    @When("User opens the {string} section")
    public void user_opens_the_section(String sectionName) {
        RecurringCalendarEventPage calendarPage = new RecurringCalendarEventPage();
        calendarPage.waitUntilLoaderScreenDisappear();
        calendarPage.repeatInputField.click();
    }

    @Then("The default value of Repeat Every should be {string}")
    public void the_default_value_of_should_be(String expectedValue) {
        RecurringCalendarEventPage calendarPage = new RecurringCalendarEventPage();
        calendarPage.waitUntilLoaderScreenDisappear();
        calendarPage.waitForRepeatEveryField();
        String actualValue = calendarPage.repeatEveryDaysField.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }


    @And("User clears the Repeat Every input field")
    public void userClearsTheRepeatEveryInputField() {
        RecurringCalendarEventPage calendarPage = new RecurringCalendarEventPage();
        calendarPage.waitUntilLoaderScreenDisappear();
        calendarPage.waitForRepeatEveryField();
        calendarPage.repeatEveryDaysField.clear();
    }

    @And("User clicks anywhere on the page")
    public void userClicksAnywhereOnThePage() {
        RecurringCalendarEventPage calendarPage = new RecurringCalendarEventPage();
        calendarPage.waitUntilLoaderScreenDisappear();
        calendarPage.justClick.click();
    }

    @Then("The error message {string} should be displayed")
    public void theErrorMessageShouldBeDisplayed(String expectedErrorMessage) {

        RecurringCalendarEventPage calendarPage = new RecurringCalendarEventPage();
        calendarPage.waitUntilLoaderScreenDisappear();
String actualErrorMessage = calendarPage.valueBlank.getText();
Assert.assertEquals(expectedErrorMessage, actualErrorMessage);


    }
}
