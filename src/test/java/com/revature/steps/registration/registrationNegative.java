package com.revature.steps.registration;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class registrationNegative {

    @When("the user provides a username {string}")
    public void the_user_provides_a_username(String username) {
        TestRunner.registrationPage.enterUsername(username);
    }

    @When("the user provides a password {string}")
    public void the_user_provides_a_password(String password) {
        TestRunner.registrationPage.enterPassword(password);
    }

    @Then("the user should stay on the registration page")
    public void the_user_should_stay_on_the_registration_page() {
        Assert.assertEquals("Account Creation", TestRunner.driver.getTitle());
    }
}
