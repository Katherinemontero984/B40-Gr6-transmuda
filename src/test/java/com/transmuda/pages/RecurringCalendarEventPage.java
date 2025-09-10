package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Events;
import org.openqa.selenium.support.FindBy;

public class RecurringCalendarEventPage extends BasePage {



    @Override
    public void navigateToModule(String tab, String module) {
        super.navigateToModule("Activities", "Calendar Events");
    }



@FindBy(xpath = "//div[@class='pull-right title-buttons-container']")
    public WebElement createCalendarEventButton;

    @FindBy(name="oro_calendar_event_form[allDay]")
    public WebElement repeatInputField;

    @FindBy(xpath = "//input[@data-related-field='interval'][1]")
    public WebElement repeatEveryDaysField;

    @FindBy (xpath = "//span[text()='This value should not be blank.']")
    public WebElement valueBlank;

}
