package pages;

import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RegisterPage {

    public RegisterPage(AppiumDriver driver) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.synrgy.kaboor.dev:id/et")
    private static WebElement inputEmail;

    @FindBy(id = "com.synrgy.kaboor.dev:id/btn_register")
    private static WebElement BuatAkunButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private static WebElement inputNomorHP;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[3]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private static WebElement inputFullname;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[4]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private static WebElement inputPassword;

    @FindBy(id = "com.synrgy.kaboor.dev:id/btn_create_account")
    private static WebElement createAccountButton;

    public void inputEmailStep(String email) {
        keyword.inputText(inputEmail, email);
    }

    public void tapBuatAkunButton() {
        keyword.tapElement(BuatAkunButton);
    }

    public void continueRegisterStep(String nomorHP, String fullName, String password) {
        keyword.inputText(inputNomorHP, nomorHP);
        keyword.inputText(inputFullname, fullName);
        keyword.inputText(inputPassword, password);
    }

    public void buatAkunButtonOncontinueRegisterStep() {
        keyword.tapElement(createAccountButton);
    }






}
