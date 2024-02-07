package steps;

import factories.driverManager;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AkunPage;
import pages.HomePage;
import pages.LoginPage;

public class loginLogoutStep {

    private final LoginPage loginPage;
    private final HomePage homePage;
    private final AkunPage akunPage;

    public loginLogoutStep() {
        AndroidDriver androidDriver = driverManager.getInstance().getDriver();
        loginPage = new LoginPage(androidDriver);
        homePage = new HomePage(androidDriver);
        akunPage = new AkunPage(androidDriver);
    }

    @When("user navigate to login page")
    public void navLoginPage() {
        homePage.tapAkunIcon();
        akunPage.verifyAkunPageComponentExistBeforeLogin();
        akunPage.tapLoginButtonOnAkunPage();
        loginPage.verifyComponentOnLoginPage1();
    }

    @And("user fill correct credential")
    public void fillCorrectCredential() {
        loginPage.doLogin();
    }

    @And("user tap Masuk button")
    public void tapMasukButton() {
        loginPage.tapMasukButton();
    }

    @Then("user login successfully")
    public void loginSuccessfully() {
        homePage.tapAkunIcon();
        akunPage.verifyKeluarButtonExist();
    }

    @When("user tap Keluar button")
    public void tapKeluarButton() {
        akunPage.tapKeluarButton();
    }

    @When("user tap Keluar button on bottomsheet")
    public void tapKeluarButtonOnBottomsheet() {
        akunPage.tapKeluarButtonOnBottomsheet();
    }

    @Then("user logout successfully")
    public void logoutSuccessfully() {
        homePage.tapAkunIcon();
        akunPage.verifyAkunPageComponentExistBeforeLogin();
    }

}
