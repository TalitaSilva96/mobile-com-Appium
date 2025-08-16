package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.AddContactPage;
import pages.HomePage;

public class AddContactTest extends BaseTest {

    @Test
    public void testAddNewContact() {
        String firstName = "Talita";
        String lastName = "Silva";
        String phone = "11999999999";
        String email = "talita@email.com";

        HomePage homePage = new HomePage(driver);
        homePage.clickAddContact();

        AddContactPage addContactPage = new AddContactPage(driver);
        addContactPage.setFirstName(firstName);
        addContactPage.setLastName(lastName);
        addContactPage.setPhone(phone);
        addContactPage.setEmail(email);
        addContactPage.saveContact();
    }
}