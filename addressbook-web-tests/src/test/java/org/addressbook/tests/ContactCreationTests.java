package org.addressbook.tests;

import org.addressbook.modules.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        applicationManager.getNavigationHelper().goToHomePage();
        applicationManager.getContactHelper().creatContact(new ContactData("Jony", "Bro", "Try"), true);
    }
}
