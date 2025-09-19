package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesOdometerPage {


    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement defaultPage;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPage;
}
