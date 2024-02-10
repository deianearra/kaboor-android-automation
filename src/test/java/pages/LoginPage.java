package pages;

import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    public LoginPage(AppiumDriver driver) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.synrgy.kaboor.dev:id/et")
    private WebElement txtEmail;
    @FindBy(id = "com.synrgy.kaboor.dev:id/btn_login")
    private WebElement masukButton;

    @FindBy(id = "com.synrgy.kaboor.dev:id/tv_forgot_password")
    private WebElement linkTxTForgotPassword;

    @FindBy(id = "com.synrgy.kaboor.dev:id/tv_terms_condition")
    private WebElement termCondition;

    @FindBy(id = "com.synrgy.kaboor.dev:id/tv_doesnt_have_an_account")
    private  WebElement belumPunyaAkun;

    @FindBy(id = "com.synrgy.kaboor.dev:id/tv_create_account")
    private  WebElement linkTxtBuatAkunYuk;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[3]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement txtPassword;

    public void tapBuatAkunYuk() {
        keyword.tapElement(linkTxtBuatAkunYuk);
        keyword.waitFor(2);
    }

    public void verifyComponentOnLoginPage1() {
        keyword.verifyElementExist(txtEmail);
        keyword.verifyElementExist(masukButton);
        keyword.verifyWordingOnElement(linkTxTForgotPassword, "Lupa Password?");
        keyword.verifyWordingOnElement(termCondition, "Dengan Log In kamu menyerujui Syarat, Ketentuan dan Kebijakan Privasi Kaboor");
        keyword.verifyWordingOnElement(belumPunyaAkun,"Belum punya akun?");
        keyword.verifyWordingOnElement(linkTxtBuatAkunYuk, "Buat akun yuk?");
        keyword.waitFor(1);
    }

    public void doLogin() {
        keyword.inputText(txtEmail, "miyali4273@bitofee.com");
        keyword.tapElement(masukButton);
        keyword.waitFor(3);
        keyword.inputText(txtPassword, "Passw0rd");
    }

    public void tapMasukButton() {
        keyword.tapElement(masukButton);
        keyword.waitFor(3);
    }

}
