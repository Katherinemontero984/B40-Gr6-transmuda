package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Events;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecurringCalendarEventPage extends BasePage {


@FindBy(xpath = "//div[@class='pull-right title-buttons-container']")
    public WebElement createCalendarEventButton;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatInputField;

    @FindBy(xpath = "//input[@data-related-field='interval'][1]")
    public WebElement repeatEveryDaysField;

    @FindBy (xpath = "//span[text()='This value should not be blank.']")
    public WebElement valueBlank;

    @FindBy(xpath ="(//h1)[2]")
    public WebElement justClick;



    public void waitForRepeatEveryField() {
        BrowserUtils.waitForVisibility(repeatEveryDaysField, 10);
        BrowserUtils.waitForClickablility(repeatEveryDaysField, 10);

    }


}
