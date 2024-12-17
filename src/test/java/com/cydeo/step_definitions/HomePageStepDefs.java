package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.*;

public class HomePageStepDefs {

    HomePage homePage;

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
       homePage = new HomePage();
       homePage.visit();
    }
    @When("the user click the {string}")
    public void the_user_click_the(String linkText) {

        homePage.clickLinkByText(linkText);
    }
    @Then("the user should be able to see {string} in the url")
    public void the_user_should_be_able_to_see_in_the_url(String endpoint) {
        BrowserUtils.verifyUrlContains(endpoint);
    }
}
