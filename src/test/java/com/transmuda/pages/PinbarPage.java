package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage extends BasePage{

    public PinbarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Learn how to use this space']")
    public WebElement homepageLink;

    @FindBy(xpath = "//h3[. = 'How To Use Pinbar']")
    public WebElement header;

    @FindBy(xpath = "//p[1]")
    public WebElement text;

    @FindBy(xpath = "//img[@src = '/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement image;

}
