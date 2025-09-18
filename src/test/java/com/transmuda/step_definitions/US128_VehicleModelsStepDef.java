package com.transmuda.step_definitions;


import com.transmuda.pages.VehiclesModelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class US128_VehicleModelsStepDef {

    // MANAGERS Log in
    @When("I navigate to the Vehicles Model page as a manager")
    public void i_navigate_to_the_vehicles_model_page_as_a_manager() {

    }

    //Navigate to correct Module
    @Then("I should access the page")
    public void i_should_access_the_page() throws InterruptedException {
        VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();
        vehiclesModelPage.waitUntilLoaderScreenDisappear();
        vehiclesModelPage.navigateToModule("Fleet", "Vehicles Model");

    }

    @Then("the page should display the expected Columns:")
    public void the_page_should_display_the_expected_columns(io.cucumber.datatable.DataTable dataTable) {

        VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();

        //Data table from features into a list
        List<String> expectedColumns = dataTable.asList();

        //all expected elements into a list
        List<WebElement> columnsHeader = Arrays.asList(
                vehiclesModelPage.ModelName,
                vehiclesModelPage.Make,
                vehiclesModelPage.CanBeRequested,
                vehiclesModelPage.CVVI,
                vehiclesModelPage.CO2Fee,
                vehiclesModelPage.CostDepreciated,
                vehiclesModelPage.TotalCost,
                vehiclesModelPage.C02Emissions,
                vehiclesModelPage.FuelType,
                vehiclesModelPage.Vendors
        );

        //collect text from all columns into a String List
        List<String> headerTexts = new ArrayList<>();
        for (WebElement each : columnsHeader) {
            headerTexts.add(each.getText());
        }

        // Print both list
        System.out.println("Expected Columns: " + expectedColumns);
        System.out.println("Header Texts: " + headerTexts);
//assert contains to ignore order, and ignore upper vs lower case
        Assert.assertTrue(headerTexts.containsAll(expectedColumns));


    }


    //DRIVER navigates to correct model
    @When("I navigate to the Vehicles Model page as a driver")
    public void i_navigate_to_the_vehicles_model_page_as_a_driver() throws InterruptedException {
        VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();
        vehiclesModelPage.navigateToModule("Fleet", "Vehicles Model");

    }
//page access denies
    @Then("I should be denied access to the page")
    public void i_should_be_denied_access_to_the_page() {


    }

    // read / print message and make sure it matches the expected message
    @Then("the page should display the message {string}")
    public void the_page_should_display_the_message(String expectedText) {
        VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();
        String actualText = vehiclesModelPage.driverMessage.getText();
        Assert.assertEquals(expectedText, actualText);
        System.out.println("vehiclesModelPage.driverMessage.getText() = " + vehiclesModelPage.driverMessage.getText());


    }


}
