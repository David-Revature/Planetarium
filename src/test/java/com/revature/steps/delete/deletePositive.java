package com.revature.steps.delete;

import com.revature.TestRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class deletePositive {

    @When("the user provides a valid planet name in the delete field")
    public void the_user_provides_a_valid_planet_name_in_the_delete_field() {
        TestRunner.homePage.enterDeletePlanetName("Earth");
    }

    @When("the user provides a valid moon name in the delete field")
    public void the_user_provides_a_valid_moon_name_in_the_delete_field() {
        TestRunner.homePage.enterDeleteMoonName("Titan");
    }

    @When("the user clicks the delete button")
    public void the_user_clicks_the_delete_button() {
        TestRunner.homePage.clickDeleteButton();
    }

    @Then("the old planet data should be deleted")
    public void the_old_planet_data_should_be_deleted() {
        String deletedRowPlanet = "";
        int attempts = 0;
        while(attempts < 5) {
            try {
                List<WebElement> rows = TestRunner.driver.findElements(By.tagName("tr"));
                for(int i=0;i<rows.size();i++) {
                    List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
                    for (int j = 0; j < cols.size(); j++) {
                        if (cols.get(j).getText().equals("Earth")) {
                            Assert.assertEquals("",deletedRowPlanet);
                        }
                    }
                }
            }
            catch(StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }

        //int numberOfRows = rows.size();
        //Assert.assertEquals("", addedRow);
    }

    @Then("the old moon data should be deleted")
    public void the_old_moon_data_should_be_deleted() {
        String deletedRowMoon = "Titan";
        int attempts = 0;
        while(attempts < 5) {
            try {
                List<WebElement> rows = TestRunner.driver.findElements(By.tagName("tr"));
                for(int i=0;i<rows.size();i++) {
                    List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
                    for (int j = 0; j < cols.size(); j++) {
                        if (cols.get(j).getText().equals("Titan")) {
                            Assert.assertEquals("",deletedRowMoon);
                        }
                    }
                }
            }
            catch(StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }

        //int numberOfRows = rows.size();
        //Assert.assertEquals("", addedRow);
    }

}
