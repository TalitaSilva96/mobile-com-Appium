package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {
    private AndroidDriver driver;

    private By addContactButton = By.id("com.android.contacts:id/floating_action_button");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickAddContact() {
        driver.findElement(addContactButton).click();
    }
}