package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehiclesOdometerPage;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehiclesOdometerSteps {


    VehiclesOdometerPage vehiclesOdometerPage = new VehiclesOdometerPage() ;
    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user enter the username {string} and password {string}")
    public void userEnterTheUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);

    }

    @Then("I should see the error message: {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(errorMessage, vehiclesOdometerPage.errorMessage.getText());
    }


    @When("driver enter the username {string} and password {string}")
    public void driverEnterTheUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the default page number should be {string}")
    public void theDefaultPageNumberShouldBe(String number) {

        Assert.assertEquals(number, vehiclesOdometerPage.defaultPage.getAttribute("value"));
    }

    @Then("the default View Per Page should be {string}")
    public void theDefaultViewPerPageShouldBe(String number) {

        Assert.assertEquals(number, vehiclesOdometerPage.viewPage.getText());
    }
}

