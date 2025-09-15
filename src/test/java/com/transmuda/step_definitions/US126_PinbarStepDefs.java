package com.transmuda.step_definitions;

import com.transmuda.pages.PinbarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US126_PinbarStepDefs {

    PinbarPage pinbarPage = new PinbarPage();

    @When("the user clicks the {string} link")
    public void the_user_clicks_the_link(String homepageLink) {
        pinbarPage.waitUntilLoaderScreenDisappear(); //Waiting until the loading screen disappears
        pinbarPage.homepageLink.click();
    }

    @Then("the user sees {string} header text")
    public void theUserSeesHeaderText(String expectedText) {
        pinbarPage.waitUntilLoaderScreenDisappear(); //Waiting until the loading screen disappears
        String actualText = pinbarPage.header.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @And("the user sees {string} text")
    public void theUserSeesText(String expectedText) {
        String actualText = pinbarPage.text.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("the user sees an image")
    public void theUserSeesAnImage() {
        pinbarPage.image.isDisplayed();
    }

}

