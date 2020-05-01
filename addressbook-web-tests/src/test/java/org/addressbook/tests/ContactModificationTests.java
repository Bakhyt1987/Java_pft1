package org.addressbook.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        applicationManager.getNavigationHelper().goToHomePage();
        applicationManager.getContactHelper().initContactModification();
        applicationManager.getContactHelper().fillContactForm("joe","gro",null);
        applicationManager.getContactHelper().submitContactModification();
        applicationManager.getContactHelper().returnToHomePage();
    }
}
