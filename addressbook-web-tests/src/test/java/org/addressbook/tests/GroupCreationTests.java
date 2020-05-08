package org.addressbook.tests;

import org.addressbook.modules.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class GroupCreationTests extends TestBase {


    @Test
    public void firstTest() {
        app.goTo().groupPage();
        List<GroupData> before = app.group().list();
        GroupData group = new GroupData("test2", "test2", "test3");
        app.group().creat(group);
        List<GroupData> after = app.group().list();
        Assert.assertEquals(after.size(), before.size() + 1);


        before.add(group);
        Comparator<? super GroupData> byId = Comparator.comparingInt(GroupData::getId);
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);

    }


}
