package org.addressbook.tests;

import org.addressbook.modules.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() throws Exception {
        applicationManager.getNavigationHelper().goToGroupPage();

        if (!applicationManager.getGroupHelper().isThereAGroup()) {
            applicationManager.getGroupHelper().creatGroup(new GroupData
                    ("Dina", "Kerimbekova", "Almalybak"));
        }
        List<GroupData> before = applicationManager.getGroupHelper().getGroupList();
        applicationManager.getGroupHelper().selectGroup(before.size() - 1);
        applicationManager.getGroupHelper().deleteSelectGroups();
        applicationManager.getGroupHelper().returnToGroupPage();
        List<GroupData> after = applicationManager.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before,after);

    }


}
