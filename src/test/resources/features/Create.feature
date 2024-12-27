Feature: Add Planets and Moons
  As a user I want to add new planets and moons to the Planetarium so I can update my findings

  Background: Create Starting Actions
    Given the user is logged in on the home page

  Scenario: Users can create a new planet with valid data
    When the user provides a valid planet name
    And the user submits the data
    Then the new data should be added
    And the user should be redirected to the home page

  Scenario: Users can create a new moon with valid data
    When the user provides a valid moon name
    And the user provides a valid planet id
    And the user submits the data
    Then the new data should be added
    And the user should be redirected to the home page

  Scenario Outline: Users can not create a new planet with invalid data
    When the user provides a planet name "<planet name>"
    And the user submits the data
    Then the user should get a browser alert saying "<error message>"
    And the user should be redirected to the home page

    Examples:
      |planet name|error message|
      |	                              |Invalid planet name|
      |Pluto Is No Longer A Planet Sad|Invalid planet name|
      |Uranus(Haha)                   |Invalid planet name|
      |Earth	                      |Invalid planet name|

  Scenario Outline: Users can not create a new moon with invalid data
    When the user provides a moon name "<moon name>"
    And the user provides a planet id "<planet id>"
    And the user submits the data
    Then the user should get a browser alert saying "<error message>"
    And the user should be redirected to the home page

    Examples:
      |moon name|planet id|error message|
      |Pluto Is No Longer A Planet Sad|1|Invalid moon name|
      |Uranus(Haha)	                  |1|Invalid moon name|
      |Titan	                      |1|Invalid moon name|
      |	                              |1|Invalid moon name|
      |Mars and Io are_cool-4         | |Invalid planet id|
      |Mars and Io are_cool-4         |4|Invalid planet id|