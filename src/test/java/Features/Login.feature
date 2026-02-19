@Smoke
Feature: User Login
  As a registered user I want to login to Ndosi's welcome page so I can access my learning material

  Scenario Outline: Successfully logged in with valid credentials
    Given the user in on login page
    When the user enters valid email <email>
    And the user enters valid password <password>
    And the user clicks the login button
    And the user clicks the learn icon
    And the user clicks on Learning Material
    And the user clicks Web Automation Basic Form
    Then the user has logged in successfully

    Examples:
    |email             | password    |
    |cucumber@gmail.com| Cucumber@123|