package com.izaanschool.verifyTextBox;

import com.izaanschool.base.BaseTest;
import com.izaanschool.pages.WelcomePage;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void checkTextBoxTest() throws InterruptedException {

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        welcomePage.checkNameTextBox ("John Doe");
        welcomePage.checkEmailTextBox ("john@yahoo.com");
        welcomePage.checkPhoneTextBox ("123456");
        welcomePage.checkAdultDropDown ();
        welcomePage.checkChildrenDropDown ();
        welcomePage.checkSubmitButton ();
    }

}
