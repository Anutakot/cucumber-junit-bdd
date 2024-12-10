package com.cydeo.step_definitions;

import com.cydeo.pages.ABTestingPage;
import com.cydeo.pages.AutoCompletePage;
import com.cydeo.pages.BasePage;
import com.cydeo.pages.HomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;

public class TestClass {

    public static void main(String[] args) {
       /* HomePage homePage = new HomePage();
        homePage.visit();

        ABTestingPage abTestingPage = new ABTestingPage();
        abTestingPage.visit();

        */


        AutoCompletePage autoCompletePage = new AutoCompletePage();
        autoCompletePage.visit();
        autoCompletePage.clickSubmitButton();

    }
}
