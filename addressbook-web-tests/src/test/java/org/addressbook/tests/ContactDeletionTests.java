package org.addressbook.tests;

import org.addressbook.modules.ContactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{
    @Test
    public void testContactDeletion() throws Exception {
        applicationManager.getNavigationHelper().goToHomePage();
        if(! applicationManager.getContactHelper().isThereAContact()){
            applicationManager.getContactHelper().creatContact(new ContactData("Dina", "Kerimbekova","Try"),true);
        }
        applicationManager.getContactHelper().selectContact();
        applicationManager.getContactHelper().deleteSelectContact();
        applicationManager.getContactHelper().returnToHomePage();
    }
}



