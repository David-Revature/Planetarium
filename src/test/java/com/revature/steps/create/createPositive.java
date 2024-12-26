package com.revature.steps.create;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
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
        String addedRow = "";
        int attempts = 0;
        while(attempts < 5) {
            try {
                List<WebElement> rows = TestRunner.driver.findElements(By.tagName("tr"));
                for(int i=0;i<rows.size();i++) {
                    List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
                    for (int j = 0; j < cols.size(); j++) {
                        if (cols.get(j).getText().equals("Mars and Io are_cool-4")) {
                            addedRow = cols.get(j).getText();
                        }
                    }
                }
            }
            catch(StaleElementReferenceException e) {

            }
            attempts++;
        }

        //int numberOfRows = rows.size();
        Assert.assertEquals("Mars and Io are_cool-4", addedRow);
    }

    /*@Then("the new data should be added")
    public void the_table_should_refresh() {
        Assert.assertEquals(5, TestRunner.homePage.getNumberOfCelestialRows());
    }*/
}
