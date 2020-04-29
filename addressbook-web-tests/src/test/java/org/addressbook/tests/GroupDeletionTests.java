package org.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {



  @Test
  public void testGroupDeletion() throws Exception {
    applicationManager.getNavigationHelper().goToGroupPage();
    applicationManager.getGroupHelper().selectGroup();
    applicationManager.getGroupHelper().deleteSelectGroups();
    applicationManager.getGroupHelper().returnToGroupPage();
  }


}
