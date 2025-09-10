package com.transmuda.pages;

import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage extends BasePage
{

    @FindBy(id ="prependedInput")
    public WebElement username;

    @FindBy(id ="prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    public void loginAsTruckDriver()
    {
        username.sendKeys(ConfigurationReader.getProperty("driver_username"));
        password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        loginButton.click();
    }

    public void loginAsSalesManager() {
        username.sendKeys(ConfigurationReader.getProperty("driver_username"));
        password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        loginButton.click();
    }

    public void loginAsStoreManager() {
        username.sendKeys(ConfigurationReader.getProperty("driver_username"));
        password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        loginButton.click();

    }
}







