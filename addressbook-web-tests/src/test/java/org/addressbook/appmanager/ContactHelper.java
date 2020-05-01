package org.addressbook.appmanager;

import org.addressbook.modules.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(String joe, String gro, ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());

        if (isElementPresent(By.name("new_group"))){
        new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }
    }
        private boolean isElementPresent(By locator) {
            return false ;
        }


    public void submitContactCreation(){
        click(By.name("submit"));
    }

    public void returnToHomePage(){
        click(By.linkText("home page"));
    }

    public void initContactModification(){
        click(By.cssSelector("img[alt='Edit']"));
    }

    public void submitContactModification(){
        click(By.name("update"));
    }


    }


