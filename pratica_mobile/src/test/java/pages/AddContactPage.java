package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AddContactPage {
    private AndroidDriver driver;

    private By firstNameField = By.id("com.android.contacts:id/left_button");
    private By lastNameField = By.xpath("//android.widget.EditText[@text='Last name']");
    private By phoneField = By.id("com.android.contacts:id/phone");
    private By emailField = By.id("com.android.contacts:id/email");
    private By saveButton = By.id("com.android.contacts:id/menu_save");

    public AddContactPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void saveContact() {
        driver.findElement(saveButton).click();
    }
}