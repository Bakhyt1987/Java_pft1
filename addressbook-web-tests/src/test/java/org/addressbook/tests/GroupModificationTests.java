package org.addressbook.tests;

import org.addressbook.modules.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification() {
        applicationManager.getNavigationHelper().goToGroupPage();

        if (!applicationManager.getGroupHelper().isThereAGroup()) {
            applicationManager.getGroupHelper().creatGroup(new GroupData
                    ("Dina", "Kerimbekova", "Almalybak"));
        }
        int before = applicationManager.getGroupHelper().getGroupCount();
        applicationManager.getGroupHelper().selectGroup(before - 1);
        applicationManager.getGroupHelper().initGroupModification();
        applicationManager.getGroupHelper().
                fillGroupForm(new GroupData("Bob", "Gooffy", "Grog"));
        applicationManager.getGroupHelper().submitGroupModification();
        applicationManager.getGroupHelper().returnToGroupPage();
        int after = applicationManager.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);
    }

}