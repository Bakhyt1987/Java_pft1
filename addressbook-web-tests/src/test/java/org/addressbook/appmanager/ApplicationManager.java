package org.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    private ContactHelper contactHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.FIREFOX)) {
            System.setProperty("webdriver.gecko.driver", "C:" +
                    "\\Users\\admin\\Desktop\\Bakhyt\\Java_pft1\\addressbook-web-tests\\libs\\geckodriver.exe");
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)) {
            System.setProperty("webdriver.chrome.driver", "C:" +
                    "\\Users\\admin\\Desktop\\Bakhyt\\Java_pft1\\addressbook-web-tests\\libs\\chromedriver.exe");
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.EDGE)) {
            System.setProperty("webdriver.msedge.driver", "C:" +
                    "\\Users\\admin\\Desktop\\Bakhyt\\Java_pft1\\addressbook-web-tests\\libs\\msedgedriver.exe");
            wd = new EdgeDriver();
        }

        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper =new ContactHelper(wd);

        wd.get("http://localhost/addressbook/");
        sessionHelper.login("admin", "secret");
    }
    public void stop() {
        wd.quit();
    }
    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
    public ContactHelper getContactHelper(){
        return contactHelper;
    }
}
