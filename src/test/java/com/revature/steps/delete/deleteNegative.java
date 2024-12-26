package com.revature.steps.delete;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;

public class deleteNegative {
    @When("the user provides an invalid planet name in the delete field")
    public void the_user_provides_an_invalid_planet_name_in_the_delete_field() {
        TestRunner.homePage.enterDeletePlanetName("Saturn");
    }
    @When("the user provides an invalid moon name in the delete field")
    public void the_user_provides_an_invalid_moon_name_in_the_delete_field() {
        TestRunner.homePage.enterDeleteMoonName("Ganymedes");
    }
}
