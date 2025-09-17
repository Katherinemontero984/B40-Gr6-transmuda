package com.transmuda.step_definitions;

import com.transmuda.pages.AccessingMainModulesPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US124_AccessingMainModules_StepDefs {

    AccessingMainModulesPage accessingMainModulesPage = new AccessingMainModulesPage();


//                          Managers

    @Then("sale manager sees {string} in the main modules")
    public void sale_manager_sees_in_the_main_modules(String expectedInSaleManagerModule) {

        BrowserUtils.sleep(2);
        List<WebElement> managerModulesWebElements = Arrays.asList(
                accessingMainModulesPage.managerDashboardsModule,
                accessingMainModulesPage.managerFleetModule,
                accessingMainModulesPage.managerCustomersModule,
                accessingMainModulesPage.managerSalesModule,
                accessingMainModulesPage.managerActivitiesModule,
                accessingMainModulesPage.managerMarketingModule,
                accessingMainModulesPage.managerReportAndSegmentsModule,
                accessingMainModulesPage.managerSystemModule
        );

        List<String> actualManagerModules = new ArrayList<>();

        for (WebElement eachmodulesWebElement : managerModulesWebElements) {
            actualManagerModules.add(eachmodulesWebElement.getText());
        }

        Assert.assertTrue(expectedInSaleManagerModule, actualManagerModules.contains(expectedInSaleManagerModule));
    }

    @Then("store manager sees {string} in the main modules")
    public void store_manager_sees_in_the_main_modules(String expectedInStoreManagerModule) {

        BrowserUtils.sleep(2);
        List<WebElement> managerModulesWebElements = Arrays.asList(
                accessingMainModulesPage.managerDashboardsModule,
                accessingMainModulesPage.managerFleetModule,
                accessingMainModulesPage.managerCustomersModule,
                accessingMainModulesPage.managerSalesModule,
                accessingMainModulesPage.managerActivitiesModule,
                accessingMainModulesPage.managerMarketingModule,
                accessingMainModulesPage.managerReportAndSegmentsModule,
                accessingMainModulesPage.managerSystemModule
        );

        List<String> actualManagerModules = new ArrayList<>();

        for (WebElement eachmodulesWebElement : managerModulesWebElements) {
            actualManagerModules.add(eachmodulesWebElement.getText());
        }

        Assert.assertTrue(expectedInStoreManagerModule, actualManagerModules.contains(expectedInStoreManagerModule));
    }


//                          Driver

    @Then("driver sees {string} in the main modules")
    public void driver_sees_in_the_main_modules(String expectedInDriverModule) {

        BrowserUtils.sleep(2);
        List<WebElement> driverModulesWebElements = Arrays.asList(
                accessingMainModulesPage.driverFleetModule,
                accessingMainModulesPage.driverCustomersModule,
                accessingMainModulesPage.driverActivitiesModule,
                accessingMainModulesPage.driverSystemModule
        );

        List<String> actualDriverModules = new ArrayList<>();

        for (WebElement eachmodulesWebElement : driverModulesWebElements) {
            actualDriverModules.add(eachmodulesWebElement.getText());
        }

        Assert.assertTrue(expectedInDriverModule, actualDriverModules.contains(expectedInDriverModule));
    }


}

