package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class US136_VehicleCostsPage extends BasePage {

    // ===== HEADERS =====
    @FindBy(xpath = "//table//thead//th")
    public List<WebElement> headerCells;

    @FindBy(xpath = "//table//thead//th[normalize-space()='TYPE']")
    public WebElement headerType;

    @FindBy(xpath = "//table//thead//th[normalize-space()='TOTAL PRICE']")
    public WebElement headerTotalPrice;

    @FindBy(xpath = "//table//thead//th[normalize-space()='DATE']")
    public WebElement headerDate;

    // ===== CHECKBOXES =====
    // Master (select-all) checkbox in the header row
    @FindBy(xpath = "//table//thead//input[@type='checkbox']")
    public WebElement masterCheckbox;

    // Row checkboxes in the table body (current page)
    @FindBy(xpath = "//table//tbody//input[@type='checkbox']")
    public List<WebElement> rowCheckboxes;

    // ===== SMALL HELPERS =====
    public List<String> getHeaderTexts() {
        return headerCells.stream().map(WebElement::getText).map(String::trim).collect(Collectors.toList());
    }

    public void checkMaster() {
        if (!masterCheckbox.isSelected()) masterCheckbox.click();
    }

    public void uncheckMaster() {
        if (masterCheckbox.isSelected()) masterCheckbox.click();
    }

    public boolean allRowsSelected() {
        return rowCheckboxes.stream().allMatch(WebElement::isSelected);
    }

    public boolean allRowsUnselected() {
        return rowCheckboxes.stream().noneMatch(WebElement::isSelected);
    }
}
