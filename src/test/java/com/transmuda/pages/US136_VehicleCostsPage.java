package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import java.util.Arrays;
import java.util.List;

public class US136_VehicleCostsPage extends BasePage {

    // Top nav
    @FindBy(xpath = "//span[@class='title title-level-1' and normalize-space()='Fleet']")
    public WebElement fleetTab;

    @FindBy(xpath = "//span[@class='title title-level-2' and normalize-space()='Vehicle Costs']")
    public WebElement vehicleCostsMenuItem;

    // Grid headers
    @FindBy(xpath = "//a[@class='grid-header-cell__link']//span[normalize-space()='Type']")
    public WebElement headerType;

    @FindBy(xpath = "//a[@class='grid-header-cell__link']//span[normalize-space()='Total Price']")
    public WebElement headerTotalPrice;

    @FindBy(xpath = "//a[@class='grid-header-cell__link']//span[normalize-space()='Date']")
    public WebElement headerDate;

    // Master + row checkboxes (current page)
    @FindBy(xpath = "(//table[.//thead])[1]//thead//input[@type='checkbox']")
    public WebElement masterCheckbox;

    @FindBy(xpath = "(//table[.//thead])[1]//tbody//input[@type='checkbox']")
    public List<WebElement> rowCheckboxes;

    // ---- helpers ----
    public void goToVehicleCosts() {
        new Actions(Driver.getDriver()).moveToElement(fleetTab).perform();
        vehicleCostsMenuItem.click();
    }

    public List<String> getHeaderTexts() {
        return Arrays.asList(
                headerType.getText().trim(),
                headerTotalPrice.getText().trim(),
                headerDate.getText().trim()
        );
    }

    public void checkMaster() {
        if (!masterCheckbox.isSelected()) masterCheckbox.click();
    }

    public void uncheckMaster() {
        if (masterCheckbox.isSelected()) masterCheckbox.click();
    }

    public boolean allRowsSelected() {
        return !rowCheckboxes.isEmpty() && rowCheckboxes.stream().allMatch(WebElement::isSelected);
    }

    public boolean allRowsUnselected() {
        return rowCheckboxes.stream().noneMatch(WebElement::isSelected);
    }
}

