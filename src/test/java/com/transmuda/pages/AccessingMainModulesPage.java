package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessingMainModulesPage extends BasePage {

   public AccessingMainModulesPage() {

       PageFactory.initElements(Driver.getDriver(), this);
   }


//                    Manager WebElements

   @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
   public WebElement managerDashboardsModule;

   @FindBy (xpath = "(//span[@class='title title-level-1'])[2]")
   public WebElement managerFleetModule;

   @FindBy (xpath = "(//span[@class='title title-level-1'])[3]")
   public WebElement managerCustomersModule;

   @FindBy (xpath = "(//span[@class='title title-level-1'])[4]")
   public WebElement managerSalesModule;

   @FindBy (xpath = "(//span[@class='title title-level-1'])[5]")
   public WebElement managerActivitiesModule;

   @FindBy (xpath = "(//span[@class='title title-level-1'])[6]")
   public WebElement managerMarketingModule;

   @FindBy (xpath = "(//span[@class='title title-level-1'])[7]")
   public WebElement managerReportAndSegmentsModule;

   @FindBy (xpath = "(//span[@class='title title-level-1'])[8]")
   public WebElement managerSystemModule;


//                    Driver WebElements

    @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement driverFleetModule;

    @FindBy (xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement driverCustomersModule;

    @FindBy (xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement driverActivitiesModule;

    @FindBy (xpath = "(//span[@class='title title-level-1'])[4]")
    public WebElement driverSystemModule;


}
