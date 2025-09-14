package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US133_DescriptionFieldPage extends BasePage {


    @FindBy(tagName = "iframe")
   public WebElement descriptionFieldIframe;




    @FindBy(xpath = "//p[1]")
    public  WebElement descriptionField;


    // @FindBy(xpath = "//p[.='Hello World']")





}
