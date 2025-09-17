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

    @Then("sale manager sees these main modules")
    public void sale_manager_sees_these_main_modules(List<String> expectedInSaleManagerModule) {

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

        Assert.assertEquals(expectedInSaleManagerModule, actualManagerModules);
    }

    @Then("store manager sees these main modules")
    public void store_manager_sees_these_main_modules(List<String> expectedInStoreManagerModule) {

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

        Assert.assertEquals(expectedInStoreManagerModule, actualManagerModules);
    }


//                          Driver

    @Then("driver sees these main modules")
    public void driver_sees_these_main_modules(List<String> expectedInDriverModule) {

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

        Assert.assertEquals(expectedInDriverModule, actualDriverModules);

    }


}

