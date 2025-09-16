package com.transmuda.step_definitions;

import com.transmuda.pages.US133_DescriptionFieldPage;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US133_DescriptionFieldStepDefs {

    US133_DescriptionFieldPage us133_descriptionFieldPage = new US133_DescriptionFieldPage();

    @When("User selects {string} field")
    public void user_selects_field(String string) {
        us133_descriptionFieldPage.waitUntilLoaderScreenDisappear();
        us133_descriptionFieldPage.descriptionFieldIframe.click();


    }

    @When("User types a message {string}")
    public void user_types_a_message(String string) {


        us133_descriptionFieldPage.descriptionFieldIframe.sendKeys(Keys.BACK_SPACE);
        us133_descriptionFieldPage.descriptionFieldIframe.sendKeys("Hello World");
        Driver.getDriver().switchTo().defaultContent();

    }

    @Then("Message should be visible")
    public void message_should_be_visible() {

        Driver.getDriver().switchTo().frame(us133_descriptionFieldPage.descriptionFieldIframe);
        String actualText = us133_descriptionFieldPage.descriptionField.getText();
        String expectedText = "Hello World";

        Assert.assertEquals(expectedText, actualText);

    }


}
