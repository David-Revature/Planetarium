package com.revature.steps.login;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginNegative {
    @When("the user provides a login username {string}")
    public void the_user_provides_a_login_username(String username) {
        TestRunner.loginPage.enterUsername(username);
    }
    @When("the user provides a login password {string}")
    public void the_user_provides_a_password(String password) {
        TestRunner.loginPage.enterPassword(password);
    }
}
