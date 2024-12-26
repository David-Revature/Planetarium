Feature: Delete Planets and Moons
  As a user I want to remove planets and moons from the Planetarium so I can correct my findings

  Background: Delete Starting Actions
    Given the user is logged in on the home page

  Scenario: Users can delete a planet with valid data
    When the user provides a valid planet name in the delete field
    And the user clicks the delete button
    Then the old planet data should be deleted
    And the user should be redirected to the home page

  Scenario: Users can delete a moon with valid data
    When the user provides a valid moon name in the delete field
    And the user clicks the delete button
    Then the old moon data should be deleted
    And the user should be redirected to the home page

  Scenario: Users can not delete a planet with invalid data
    When the user provides an invalid planet name in the delete field
    And the user clicks the delete button
    Then the user should get a browser alert saying "Invalid planet name"
    And the user should be redirected to the home page

  Scenario: Users can not delete a moon with invalid data
    When the user provides an invalid moon name in the delete field
    And the user clicks the delete button
    Then the user should get a browser alert saying "Invalid moon name"
    And the user should be redirected to the home page