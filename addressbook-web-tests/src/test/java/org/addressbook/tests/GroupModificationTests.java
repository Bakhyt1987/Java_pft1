package org.addressbook.tests;

import org.addressbook.modules.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{
    @Test
    public  void testGroupModification(){
        applicationManager.getNavigationHelper().goToGroupPage();
        if(! applicationManager.getGroupHelper().isThereAGroup()){
            applicationManager.getGroupHelper().creatGroup(new GroupData("Dina", "Kerimbekova", "Almalybak"));
        }
        applicationManager.getGroupHelper().selectGroup();
        applicationManager.getGroupHelper().initGroupModification();
        applicationManager.getGroupHelper().
                fillGroupForm(new GroupData("Bob","Gooffy","Grog"));
        applicationManager.getGroupHelper().submitGroupModification();
        applicationManager.getGroupHelper().returnToGroupPage();
    }
}
