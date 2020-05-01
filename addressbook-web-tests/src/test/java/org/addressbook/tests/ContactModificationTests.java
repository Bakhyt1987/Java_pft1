package org.addressbook.tests;

import org.addressbook.modules.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        applicationManager.getNavigationHelper().goToHomePage();
        applicationManager.getContactHelper().initContactModification();
        applicationManager.getContactHelper().fillContactForm(new ContactData("123","2323",null),false);
        applicationManager.getContactHelper().submitContactModification();
        applicationManager.getContactHelper().returnToHomePage();
    }
}
