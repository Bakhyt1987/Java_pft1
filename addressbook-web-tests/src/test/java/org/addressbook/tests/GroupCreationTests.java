package org.addressbook.tests;

import org.addressbook.modules.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void firstTest() throws Exception {
        applicationManager.getNavigationHelper().goToGroupPage();
        applicationManager.getGroupHelper().initGroupCreation();
        applicationManager.getGroupHelper().fillGroupForm(new GroupData("Dina", "Kerimbekova", "Almalybak"));
        applicationManager.getGroupHelper().submitGroupCreation();
        applicationManager.getGroupHelper().returnToGroupPage();
    }


}
