package pages;

import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AkunPage {

    protected AppiumDriver appiumDriver;

    public AkunPage(AppiumDriver driver) {
        this.appiumDriver = driver;
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.synrgy.kaboor.dev:id/btn_msv_login")
    private WebElement loginButton;

    @FindBy(id = "com.synrgy.kaboor.dev:id/tv_title")
    private WebElement titleLoginPage;

    @FindBy(id = "com.synrgy.kaboor.dev:id/tv_description")
    private WebElement deskripsiLoginPage;

    @FindBy(id = "com.synrgy.kaboor.dev:id/logout_container")
    private WebElement logoutButton;

    @FindBy(id = "com.synrgy.kaboor.dev:id/btn_secondary")
    private WebElement keluarButtonOnBottomsheet;

    public void verifyAkunPageComponentExistBeforeLogin() {
        keyword.waitFor(2);
        keyword.verifyWordingOnElement(titleLoginPage, "Anda belum login");
        keyword.verifyWordingOnElement(deskripsiLoginPage, "Untuk melanjutkan pemesanan tiket, anda harus login terlebih dahulu");
        keyword.verifyElementExist(loginButton);
    }

    public void tapLoginButtonOnAkunPage() {
        keyword.tapElement(loginButton);
        keyword.waitFor(2);
    }

    public void verifyKeluarButtonExist() {
        keyword.verifyElementExist(logoutButton);
    }
    public void tapKeluarButton() {
        keyword.tapElement(logoutButton);
        keyword.waitFor(2);
        keyword.verifyElementExist(keluarButtonOnBottomsheet);
    }
    public void tapKeluarButtonOnBottomsheet() {
        keyword.tapElement(keluarButtonOnBottomsheet);
        keyword.waitFor(5);
    }

}
