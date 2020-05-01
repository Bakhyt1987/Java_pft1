package org.addressbook.tests;

import org.addressbook.modules.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{
    @Test
    public  void testGroupModification(){
        applicationManager.getNavigationHelper().goToGroupPage();
        applicationManager.getGroupHelper().selectGroup();
        applicationManager.getGroupHelper().initGroupModification();
        applicationManager.getGroupHelper().
                fillGroupForm(new GroupData("Bob",null,null));
        applicationManager.getGroupHelper().submitGroupModification();
        applicationManager.getGroupHelper().returnToGroupPage();
    }
}
