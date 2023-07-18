package com.izaanschool.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage extends BasePageObject {

    // WebDriver driver;
    private String pageUrl = "https://master.d2thmk3us0b2mb.amplifyapp.com/";

    public WelcomePage(WebDriver driver, Logger log) {
        super (driver, log);
    }

    /**
     * Open WelcomePage with it's url
     */
    public void openPage() {
        log.info ("Opening page: " + pageUrl);
        openUrl (pageUrl);
        log.info ("Page opened!");
    }

    private By nameTextBox = By.id ("name");
    private By emailTextBox = By.id ("email");
    private By phoneTextBox = By.id ("phone");
    private By adultCheckBox = By.id ("adults");
    private By childrenCheckBox = By.id ("children");
    private By submitButton = By.xpath ("//*[@id=\"registration-form\"]/input[4]");


    public void checkNameTextBox(String name) throws InterruptedException {
        log.info ("type name");
        click (nameTextBox);
        type (name, nameTextBox);
    }

    public void checkEmailTextBox(String email) {
        log.info ("type email");
        click (emailTextBox);
        type (email, emailTextBox);
    }

    public void checkPhoneTextBox(String phone) throws InterruptedException {
        click (phoneTextBox);
        type (phone, phoneTextBox);
    }
    public void checkAdultDropDown() {
        Select dropDown = new Select (find (adultCheckBox));
        dropDown.selectByVisibleText ("2");

    }
    public void checkChildrenDropDown() throws InterruptedException {
        Select dropDown = new Select (find (childrenCheckBox));
        dropDown.selectByVisibleText ("2");
        Thread.sleep (1000);
    }

    public void checkSubmitButton(){
        log.info ("click submit button");
        click (submitButton);
    }
}






