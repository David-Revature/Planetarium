package com.revature.steps.read;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class readPositive {
    @Given("the user is logged in on the home page")
    public void the_user_is_logged_in_on_the_home_page() {
        TestRunner.loginPage.setUpLoggedInUser();
    }

    @Then("the user should be able to see their planets, moons, and a greeting message")
    public void the_user_should_be_able_to_see_their_planets_moons_and_a_greeting_message() {
        try{
            TestRunner.wait.until(ExpectedConditions.titleIs("Home"));
            Assert.assertEquals("Welcome to the Home Page Batman", TestRunner.homePage.getHomePageGreeting());
            Assert.assertEquals(4, TestRunner.homePage.getNumberOfCelestialRows());
        }
        finally {
            TestRunner.homePage.logout();
        }
    }
}
