package org.addressbook.tests;

import org.addressbook.modules.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test (enabled = false)
    public void testContactModification(){
        app.goTo().goToHomePage();
        if(! app.getContactHelper().isThereAContact()){
            app.getContactHelper().creatContact(new ContactData("Dina", "Kerimbekova","Try"),true);
        }
        app.getContactHelper().contactModificationForm(new ContactData("123","2323",null),false);

    }
}
