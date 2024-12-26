Feature: User Login
  As a user I want to securely access my account so I can interact with the Planetarium in a secure environment

  Background: Login Starting Actions
    Given The user is on the login page

  Scenario: Users can login with valid credentials
    When the user provides a valid login username
    And the user provides a valid login password
    And the user submits the login credentials
    Then the user should be redirected to the home page

  Scenario Outline: Users can not login with invalid credentials
    When the user provides a login username "<username>"
    And the user provides a login password "<password>"
    And the user submits the login credentials
    Then the user should get a browser alert saying "<error message>"
    And the user should be redirected to the login page

    Examples:
    |username|password|error message|
    |Batman  |Iamtheintern1939|Invalid credentials|
    |Robin   |Iamthenight1939 |Invalid credentials|
    |Robin   |Iamtheintern1939|Invalid credentials|
