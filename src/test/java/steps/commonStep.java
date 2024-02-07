package steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import factories.driverManager;
import helpers.keyword;
import pages.*;


public class commonStep {
    private final HomePage homePage;

    public commonStep() {
        AndroidDriver androidDriver = driverManager.getInstance().getDriver();
        homePage = new HomePage(androidDriver);
    }

    @Given("user open Kaboor app")
    public void userOpenSwagLabsApp() {
        homePage.verifyNavComponentExist();
    }

    @And("user take screenshot {string}")
    public void userTakeScreenshot(String screenshot) {
        keyword.takeScreenshot(screenshot);
    }
}
