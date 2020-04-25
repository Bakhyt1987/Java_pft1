package org.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void firstTest() throws Exception {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("Dina", "Kerimbekova", "Almalybak"));
        submitGroupCreation();
        returnToGroupPage();
    }


}
