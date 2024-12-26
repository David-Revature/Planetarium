package com.revature.steps.login;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginPositive {
    @When("the user provides a valid login username")
    public void the_user_provides_a_valid_login_username() {
        TestRunner.loginPage.enterUsername("Batman");
    }
    @When("the user provides a valid login password")
    public void the_user_provides_a_valid_login_password() {
        TestRunner.loginPage.enterPassword("Iamthenight1939");
    }

    @When("the user submits the login credentials")
    public void the_user_submits_the_login_credentials() {
        TestRunner.loginPage.clickLoginButton();
    }

    @Then("the user should be redirected to the home page")
    public void the_user_should_be_redirected_to_the_home_page() {
        TestRunner.wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("Planetarium Login")));
        Assert.assertEquals("Home", TestRunner.driver.getTitle());
    }
}
