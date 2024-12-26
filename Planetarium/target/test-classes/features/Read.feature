Feature: View User Planets and Moons
  As a user I want to see my planets and moons added to the Planetarium so I can track my findings

  Scenario: Login should allow for viewing owned resources
    Given the user is logged in on the home page
    Then the user should be able to see their planets, moons, and a greeting message

  Scenario: Users not logged in should not be able to view the home page
    Given the user is not logged in
    When the user tries to login
    Then the user should be denied access to the home page