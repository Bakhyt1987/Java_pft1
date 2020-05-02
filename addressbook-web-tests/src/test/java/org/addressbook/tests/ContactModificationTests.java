package org.addressbook.tests;

import org.addressbook.modules.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        applicationManager.getNavigationHelper().goToHomePage();
        if(! applicationManager.getContactHelper().isThereAContact()){
            applicationManager.getContactHelper().creatContact(new ContactData("Dina", "Kerimbekova","Try"),true);
        }
        applicationManager.getContactHelper().contactModificationForm(new ContactData("123","2323",null),false);

    }
}
