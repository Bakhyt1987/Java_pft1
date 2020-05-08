package org.addressbook.tests;

import org.addressbook.modules.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test (enabled = false)
    public void testContactCreation() {
        app.goTo().goToHomePage();
        app.getContactHelper().creatContact(new ContactData("Jony", "Bro", "Try"), true);
    }
}
