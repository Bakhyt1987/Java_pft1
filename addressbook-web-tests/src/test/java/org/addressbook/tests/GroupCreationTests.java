package org.addressbook.tests;

import org.addressbook.modules.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void firstTest() throws Exception {
        applicationManager.getNavigationHelper().goToGroupPage();
        int before = applicationManager.getGroupHelper().getGroupCount();
        applicationManager.getGroupHelper().creatGroup(new GroupData("John", "Doew", "gros"));
        int after = applicationManager.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before + 1);
    }


}
