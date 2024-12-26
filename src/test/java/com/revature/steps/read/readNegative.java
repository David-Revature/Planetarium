package com.revature.steps.read;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class readNegative {
    @Given("the user is not logged in")
    public void the_user_is_not_logged_in() {
        TestRunner.loginPage.openLoginPage();
    }

    @When("the user tries to login")
    public void the_user_tries_to_login() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.homePage.tryToAccessHomePageDirectly();
    }

    @Then("the user should be denied access to the home page")
    public void the_user_should_be_denied_access_to_the_home_page() {
        Assert.assertNotEquals("Home", TestRunner.driver.getTitle());
    }

}
