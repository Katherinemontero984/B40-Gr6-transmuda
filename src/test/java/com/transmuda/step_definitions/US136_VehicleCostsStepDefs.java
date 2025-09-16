package com.transmuda.step_definitions;

import com.transmuda.pages.US136_VehicleCostsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US136_VehicleCostsStepDefs {

    US136_VehicleCostsPage vehicleCostsPage = new US136_VehicleCostsPage();

    @Then("the user should see table headers:")
    public void the_user_should_see_table_headers(List<String> expectedHeaders) {
        // e.g. [TYPE, TOTAL PRICE, DATE]
        Assert.assertEquals("Headers mismatch!", expectedHeaders, vehicleCostsPage.getHeaderTexts());
    }

    @When("the user checks the master checkbox")
    public void the_user_checks_the_master_checkbox() {
        vehicleCostsPage.checkMaster();
    }

    @Then("all row checkboxes on the current page should be selected")
    public void all_row_checkboxes_on_the_current_page_should_be_selected() {
        Assert.assertTrue("Not all rows are selected!", vehicleCostsPage.allRowsSelected());
    }

    @When("the user unchecks the master checkbox")
    public void the_user_unchecks_the_master_checkbox() {
        vehicleCostsPage.uncheckMaster();
    }

    @Then("all row checkboxes on the current page should be unselected")
    public void all_row_checkboxes_on_the_current_page_should_be_unselected() {
        Assert.assertTrue("Some rows are still selected!", vehicleCostsPage.allRowsUnselected());
    }
}
