package org.addressbook.tests;

import org.addressbook.modules.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() throws Exception {
        applicationManager.getNavigationHelper().goToGroupPage();
        int before = applicationManager.getGroupHelper().getGroupCount();
        if (!applicationManager.getGroupHelper().isThereAGroup()) {
            applicationManager.getGroupHelper().creatGroup(new GroupData
                    ("Dina", "Kerimbekova", "Almalybak"));
        }
        applicationManager.getGroupHelper().selectGroup(before - 1);
        applicationManager.getGroupHelper().deleteSelectGroups();
        applicationManager.getGroupHelper().returnToGroupPage();
        int after = applicationManager.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before - 1);
    }


}
