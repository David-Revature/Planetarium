package com.revature.steps.registration;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class registrationPositive {
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        TestRunner.loginPage.openLoginPage();
    }

    @Given("the user clicks the register link")
    public void the_user_clicks_the_register_link() {
        TestRunner.loginPage.clickRegistrationLink();
    }

    @When("the user provides a valid username")
    public void the_user_provides_a_valid_username() {
        TestRunner.registrationPage.enterUsername("Super_man-2001");
    }

    @When("the user provides a valid password")
    public void the_user_provides_a_valid_password() {
        TestRunner.registrationPage.enterPassword("Krypton-was_2000");
    }

    @When("the user submits the credentials")
    public void the_user_submits_the_credentials() {
        TestRunner.registrationPage.clickCreateButton();
    }

    @Then("the user should get a browser alert saying {string}")
    public void the_user_should_get_a_browser_alert_saying(String expectedMessage) {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = TestRunner.driver.switchTo().alert();
        Assert.assertEquals(expectedMessage,alert.getText());
        alert.accept();
    }

    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        TestRunner.wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("Account Creation")));
        Assert.assertEquals("Planetarium Login", TestRunner.driver.getTitle());
    }

}
