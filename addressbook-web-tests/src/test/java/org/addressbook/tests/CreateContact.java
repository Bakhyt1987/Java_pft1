package org.addressbook.tests;

import org.addressbook.modules.AddNewData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateContact extends TestBase {





  @Test
  public void testCreateContact() throws Exception {
    goToAddNewPage();
    fillTheAddNewForm(
            new AddNewData("Bakhyt",
                    "John",
                    "Boyd",
                    "Bent",
                    "The best man",
                    "The great company",
                    "Solomon street 100",
                    "12",
                    "555-6556",
                    "555-7894",
                    "255-5858",
                    "b-root@list.ru",
                    "wert.com"));
    submitAddNewCreation();
    returnToHomePage();
  }

  public void submitAddNewCreation() {
    applicationManager.getGroupHelper().wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  public void returnToHomePage() {
    applicationManager.getGroupHelper().wd.findElement(By.linkText("home page")).click();
  }

  public void fillTheAddNewForm(AddNewData addNewData) {
    applicationManager.getGroupHelper().wd.findElement(By.name("firstname")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("firstname")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("firstname")).sendKeys(addNewData.getFirstname());
    applicationManager.getGroupHelper().wd.findElement(By.name("middlename")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("middlename")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("middlename")).sendKeys(addNewData.getMiddlename());
    applicationManager.getGroupHelper().wd.findElement(By.name("lastname")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("lastname")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("lastname")).sendKeys(addNewData.getLastname());
    applicationManager.getGroupHelper().wd.findElement(By.name("nickname")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("nickname")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("nickname")).sendKeys(addNewData.getNickname());
    applicationManager.getGroupHelper().wd.findElement(By.name("title")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("title")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("title")).sendKeys(addNewData.getTitle());
    applicationManager.getGroupHelper().wd.findElement(By.name("company")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("company")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("company")).sendKeys(addNewData.getCompany());
    applicationManager.getGroupHelper().wd.findElement(By.name("address")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("address")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("address")).sendKeys(addNewData.getAddress());
    applicationManager.getGroupHelper().wd.findElement(By.name("home")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("home")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("home")).sendKeys(addNewData.getHome());
    applicationManager.getGroupHelper().wd.findElement(By.name("mobile")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("mobile")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("mobile")).sendKeys(addNewData.getMobile());
    applicationManager.getGroupHelper().wd.findElement(By.name("work")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("work")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("work")).sendKeys(addNewData.getWork());
    applicationManager.getGroupHelper().wd.findElement(By.name("fax")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("fax")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("fax")).sendKeys(addNewData.getFax());
    applicationManager.getGroupHelper().wd.findElement(By.name("email")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("email")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("email")).sendKeys(addNewData.getEmail());
    applicationManager.getGroupHelper().wd.findElement(By.name("homepage")).click();
    applicationManager.getGroupHelper().wd.findElement(By.name("homepage")).clear();
    applicationManager.getGroupHelper().wd.findElement(By.name("homepage")).sendKeys(addNewData.getHomepage());
  }

  public void goToAddNewPage() {
    applicationManager.getGroupHelper().wd.findElement(By.linkText("add new")).click();
  }




}
