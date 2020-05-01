package org.addressbook.tests;

import org.addressbook.modules.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation(){
        applicationManager.getNavigationHelper().goToHomePage();
        applicationManager.getContactHelper().initContactCreation();
        applicationManager.getContactHelper().fillContactForm("joe", "gro", new ContactData("test_name","test_surname","Bob  "));
        applicationManager.getContactHelper().submitContactCreation();
        applicationManager.getGroupHelper().returnToGroupPage();

    }
}
