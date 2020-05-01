package org.addressbook.tests;

import org.addressbook.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public final ApplicationManager applicationManager = new ApplicationManager(BrowserType.EDGE);

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        applicationManager.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        applicationManager.stop();

    }

}
