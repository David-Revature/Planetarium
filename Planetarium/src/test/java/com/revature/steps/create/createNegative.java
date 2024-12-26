package com.revature.steps.create;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class createNegative {
    @When("the user provides a planet name {string}")
    public void the_user_provides_a_planet_name(String name) {
        TestRunner.homePage.enterPlanetName(name);
    }

    @When("the user provides a moon name {string}")
    public void the_user_provides_a_moon_name(String name) {
        TestRunner.homePage.enterMoonName(name);
    }

    @When("the user provides a planet id {string}")
    public void the_user_provides_a_planet_id(String id) {
        TestRunner.homePage.enterOrbit(id);
    }
}