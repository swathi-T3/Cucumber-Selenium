@tag
Feature: Submit Simple Form
  User needs to fill the form in traning-support.net application

  @smoke
  Scenario: Submit the simple form with valid credentials
    Given User opens the simple form webpage
    When User enters the valid firstName
    And User enters the valid lastName
    And User enters the valid email id
    And User enters the valid contact number
    And User clicks on the submit button
    Then Close the browser

 