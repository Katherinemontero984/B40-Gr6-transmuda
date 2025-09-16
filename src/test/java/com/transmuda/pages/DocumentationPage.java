package com.transmuda.pages;

import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage extends BasePage
{

    @FindBy(css = "i.fa-question-circle")
    public WebElement questionMarkIcon;


}







