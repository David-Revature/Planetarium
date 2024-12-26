package com.revature.steps.create;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class createPositive {
    @When("the user provides a valid planet name")
    public void the_user_provides_a_valid_planet_name() {
        TestRunner.homePage.enterPlanetName("Mars and Io are_cool-4");
    }

    @When("the user provides a valid moon name")
    public void the_user_provides_a_valid_moon_name() {
        TestRunner.homePage.enterMoonName("Mars and Io are_cool-4");
    }

    @When("the user provides a valid planet id")
    public void the_user_provides_a_valid_planet_id() {
        TestRunner.homePage.enterOrbit("1");
    }

    @When("the user submits the data")
    public void the_user_submits_the_data() {
        TestRunner.homePage.clickSubmitButton();
    }

    @Then("the new data should be added")
    public void the_table_should_refresh() {
        List<WebElement> rows = TestRunner.driver.findElements(By.tagName("tr"));
        int numberOfRows = rows.size();
        Assert.assertEquals(5, numberOfRows);
    }

    /*@Then("the new data should be added")
    public void the_table_should_refresh() {
        Assert.assertEquals(5, TestRunner.homePage.getNumberOfCelestialRows());
    }*/
}
