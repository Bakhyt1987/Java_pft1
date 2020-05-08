package org.addressbook.tests;

import org.addressbook.modules.ContactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{
    @Test (enabled = false)
    public void testContactDeletion() throws Exception {
        app.goTo().goToHomePage();
        if(! app.getContactHelper().isThereAContact()){
            app.getContactHelper().creatContact(new ContactData("Dina", "Kerimbekova","Try"),true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectContact();
        app.getContactHelper().returnToHomePage();
    }
}



