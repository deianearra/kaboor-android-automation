package steps;

import factories.driverManager;
import helpers.randomData;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AkunPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class registerStep {

    private final LoginPage loginPage;
    private final HomePage homePage;
    private final AkunPage akunPage;

    private final RegisterPage registerPage;

    public registerStep() {
        AndroidDriver androidDriver = driverManager.getInstance().getDriver();
        loginPage = new LoginPage(androidDriver);
        homePage = new HomePage(androidDriver);
        akunPage = new AkunPage(androidDriver);
        registerPage = new RegisterPage(androidDriver);
    }

    @When("user navigate to register page")
    public void navigateToRegisterPage() {
        homePage.tapAkunIcon();
        akunPage.tapLoginButtonOnAkunPage();
        loginPage.tapBuatAkunYuk();
    }

    @When("user input email")
    public void inputEmail() {
        registerPage.inputEmailStep(randomData.getEmail());

    }

    @And("user tap Buat Akun button after input email")
    public void tapBuatAKunButton() {
        registerPage.tapBuatAkunButton();
    }


    @And("user input nomor HP, nama lengkap, password")
    public void fillAllRequireData() {
        registerPage.continueRegisterStep("08316235761", "Naruto Uzumaki", "Passw0rd");
    }


    @And("user tap Buat Akun button")
    public void tapBuatAkunButtonAfterFillRequireData() {
        registerPage.buatAkunButtonOncontinueRegisterStep();
    }






}
