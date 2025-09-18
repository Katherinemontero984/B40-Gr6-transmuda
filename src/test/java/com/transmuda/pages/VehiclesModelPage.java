package com.transmuda.pages;

import com.transmuda.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class VehiclesModelPage extends BasePage {

    public VehiclesModelPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Columns view


    @FindBy(xpath = "//th[contains(@class, 'grid-header-cell-ModelName')]//span[@class='grid-header-cell__label']")
    public WebElement ModelName;


    @FindBy(css = "[id^='grid-custom-entity-grid-'] .grid-header-cell-Make .grid-header-cell__label")
    public WebElement Make;

    @FindBy(css = "[id^='grid-custom-entity-grid-'] .grid-header-cell-Canberequested .grid-header-cell__label")
    public WebElement CanBeRequested;

    @FindBy(css = "[id^='grid-custom-entity-grid-'] .grid-header-cell-CatalogValue .grid-header-cell__label")
    public WebElement CVVI;

    @FindBy(css = "[id^='grid-custom-entity-grid-'] .grid-header-cell-CO2Fee .grid-header-cell__label")
    public WebElement CO2Fee;

    @FindBy(css = "[id^='grid-custom-entity-grid-'] .grid-header-cell-Cost .grid-header-cell__label")
    public WebElement CostDepreciated;

    @FindBy(css = "[id^='grid-custom-entity-grid-'] .grid-header-cell-TotalCost .grid-header-cell__label")
    public WebElement TotalCost;

    @FindBy(css = "[id^='grid-custom-entity-grid-'] .grid-header-cell-CO2Emissions .grid-header-cell__label")
    public WebElement C02Emissions;

    @FindBy(css = "[id^='grid-custom-entity-grid-'] .grid-header-cell-FuelType .grid-header-cell__label")
    public WebElement FuelType;

    @FindBy(css = "[id^='grid-custom-entity-grid-'] .grid-header-cell-Vendors .grid-header-cell__label")
    public WebElement Vendors;


    //Driver Message

    @FindBy(xpath = "//*[@id=\"flash-messages\"]/div/div/div[2]/div")
    public WebElement driverMessage;


}
