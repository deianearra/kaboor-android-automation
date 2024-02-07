package pages;

import helpers.keyword;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class HomePage {

    protected AppiumDriver appiumDriver;

    public HomePage(AppiumDriver driver) {
        this.appiumDriver = driver;
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.synrgy.kaboor.dev:id/homeFragment")
    private WebElement berandaIcon;

    @FindBy(id = "com.synrgy.kaboor.dev:id/orderFragment")
    private WebElement pesananIcon;

    @FindBy(id = "com.synrgy.kaboor.dev:id/notificationFragment")
    private WebElement notifikasiIcon;

    @FindBy(id = "com.synrgy.kaboor.dev:id/accountFragment")
    private WebElement akunIcon;


    public void verifyNavComponentExist() {
        keyword.verifyElementExist(berandaIcon);
        keyword.verifyElementExist(pesananIcon);
        keyword.verifyElementExist(notifikasiIcon);
        keyword.verifyElementExist(akunIcon);

    }

    public void tapAkunIcon() {
        keyword.tapElement(akunIcon);
        keyword.waitFor(4);
    }



}
