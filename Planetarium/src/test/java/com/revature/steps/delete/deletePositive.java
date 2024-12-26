package com.revature.steps.delete;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    @Then("the old data should be deleted")
    public void the_old_data_should_be_deleted() {
        List<WebElement> rows = TestRunner.driver.findElements(By.tagName("tr"));
        int numberOfRows = rows.size();
        Assert.assertEquals(5, numberOfRows);
        /*for(int i=0;i<rows.size();i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            for(int j=0;j<cols.size();j++) {
                if(cols.get(j).getText().equals("Mars and Io are_cool-4")){
                    Assert.assertNotEquals("Mars and Io are_cool-4", cols.get(j).getText());
                }
            }
        }*/
    }

}
