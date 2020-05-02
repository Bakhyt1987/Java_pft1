package org.addressbook.tests;

import org.addressbook.modules.GroupData;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {



  @Test
  public void testGroupDeletion() throws Exception {
    applicationManager.getNavigationHelper().goToGroupPage();
    if(! applicationManager.getGroupHelper().isThereAGroup()){
      applicationManager.getGroupHelper().creatGroup(new GroupData("Dina", "Kerimbekova", "Almalybak"));
    }
    applicationManager.getGroupHelper().selectGroup();
    applicationManager.getGroupHelper().deleteSelectGroups();
    applicationManager.getGroupHelper().returnToGroupPage();
  }


}
